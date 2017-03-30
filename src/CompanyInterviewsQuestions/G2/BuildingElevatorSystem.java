package CompanyInterviewsQuestions.G2;

import javax.lang.model.element.ElementVisitor;
import java.util.*;

public class BuildingElevatorSystem {


	public static void main(String[] args){
		List<Integer> limitedAccessList = new ArrayList<Integer>();
		// Put limited access on basement
		limitedAccessList.add(1);
		// Put limited acces on 50th floor
		limitedAccessList.add(50);

		Building building = BuildingFactory.constructBuilding("G2 Web Services", 50, limitedAccessList);
		ElevatorManager elevatorManager = new ElevatorManager(building);

		Passenger passenger1 = new Passenger(5, 2, new AccessLevelNode(AccessGroup.LIMITED_ACCESS), 50, ElevatorType.PUBLIC);

		elevatorManager.makeFloorRequest(passenger1);

	}


}


// Factory

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


class BuildingFactory {

	// This construction is based on the exercise requirements :

	public static Building constructBuilding(String name, int floorCount, List<Integer> limitAccessList){
		List<Floor> floors = new ArrayList<Floor>();
		List<Elevator> elevators = new ArrayList<Elevator>();

		Elevator publicElevator = new PublicElevator();
		Elevator freightElevator = new FreightElevator();

		for(int i = 1; i <= floorCount; i++){
			// 1 is assumed basement level
			if(i == 1){
				Floor basement = new BasementFloor();
				if(limitAccessList.contains(i)){
					basement.setFloorAccess(AccessGroup.LIMITED_ACCESS);
				}
				// Setting inital elevator floor
				if(i == publicElevator.currentFloor){
					basement.elevatorOnFloor = publicElevator;
				} else if(i == freightElevator.currentFloor){
					basement.elevatorOnFloor = freightElevator;
				}

				floors.add(basement);
			} else {
				Floor floor = new WindowFloor(i);
				if(limitAccessList.contains(i)){
					floor.setFloorAccess(AccessGroup.LIMITED_ACCESS);
				}
				// Setting inital elevator floor
				if(i == publicElevator.currentFloor){
					floor.elevatorOnFloor = publicElevator;
				} else if(i == freightElevator.currentFloor){
					floor.elevatorOnFloor = freightElevator;
				}
				floors.add(floor);
			}
		}

		elevators.add(publicElevator);
		elevators.add(freightElevator);

		return new Building(name, floors, elevators);

	}
}

class ElevatorManager {
	public Building building;
	public Map<ElevatorType, Integer> elevatorMap;


	public ElevatorManager(Building building){
		this.building = building;
		this.elevatorMap = new HashMap<ElevatorType, Integer>();
		this.initalizeManager();
	}

	public void initalizeManager(){
		for(Floor f : this.building.floors){
			if(f.elevatorOnFloor != null){
				this.elevatorMap.put(f.elevatorOnFloor.type, f.levelLocation);

				System.out.println(f.levelLocation + " : " + f.floorAccessLevel.group + " : " + f.elevatorOnFloor.type);
			} else {
				System.out.println(f.levelLocation + " : " + f.floorAccessLevel.group);
			}
		}

	}

	public void makeFloorRequest(Passenger passenger){

		ElevatorType elevatorType = passenger.elevatorType;
		if(elevatorMap.containsKey(elevatorType)){ // Should always be the case
			int elevatorCurrentFloor = elevatorMap.get(elevatorType);
			int passangerFloorRequest = passenger.floorRequest;

			// floor request is 5
			// current floor is 2
			// elevator is on 7

			// user requests floor and gets on the elevator
			// put in elevator's queue
			// elevator take first request in queue and moves to that floor.
			// If passanger is at current row, remove elevator array, add to floor array.




		/*	if(floorRequest == elevatorCurrentFloor){
				Floor currentFloor = this.building.floors.get(elevatorCurrentFloor);
				currentFloor.addPassengerToFloor(passenger);
			} else if (floorRequest < elevatorCurrentFloor){
				// Than elevator is above me...


			}*/


		} else {
			System.out.println("Elevator type is unknown");
		}





		// Get passengers current floor and elevator type
		//if(this.elevatorList.contains(passenger.currentFloor)){


		//}


		// Get elevators current floor
	}





}




class Building {

	public String name;
	public List<Floor> floors;
	public List<Elevator> elevators;

	public Building(String name, List<Floor> floors, List<Elevator> elevators){
		this.name = name;
		this.floors = floors;
		this.elevators = elevators;
	}

}


// Floors
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


class WindowFloor extends Floor {
	public WindowFloor(int level){
		super(level, FloorType.WINDOW_FLOOR, new AccessLevelNode(AccessGroup.ALL_ACCESS));
	}
}


class BasementFloor extends Floor {
	public BasementFloor(){
		// assuming level 1 is basement
		super(1, FloorType.BASEDMENT, new AccessLevelNode(AccessGroup.ALL_ACCESS));
	}
}


class Floor {

	public int levelLocation;
	public FloorType type;
	public AccessLevelNode floorAccessLevel;
	public Elevator elevatorOnFloor;
	public List<Passenger> passengers;

	public Floor(int level, FloorType type, AccessLevelNode access){
		this.levelLocation = level;
		this.type = type;
		this.floorAccessLevel = access;
		this.elevatorOnFloor = null;
		this.passengers = new ArrayList<Passenger>();
	}

	public void addPassengerToFloor(Passenger passenger){
		if(this.floorAccessLevel.group == passenger.accessLevel.group){
			this.passengers.add(passenger);
		} else {
			System.out.println("Error you don't have access to this floor");
		}


	}

	public void setFloorAccess(AccessGroup access){
		this.floorAccessLevel.group = access;
	}
}


// Elevators
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

class PublicElevator extends Elevator {
	public PublicElevator(){
		super(ElevatorType.PUBLIC, ElevatorStatus.ON);
		this.weightLimit = 1000;
		this.currentFloor = 2; // Setting it to first non-basement floor;
	}
}

class FreightElevator extends Elevator {
	public FreightElevator(){
		super(ElevatorType.FREIGHT, ElevatorStatus.ON);
		this.weightLimit = 3000;
		this.currentFloor = 1; // Setting to basement floor
	}
}



class Elevator {

	public int currentFloor;
	public int currentPassengerWeight;
	public ElevatorType type;
	public ElevatorDirection direction;
	public ElevatorStatus status;
	//public List<Integer> floorRequests;
	public List<Passenger> passengers;
	public int weightLimit;
	//public int passengerCount;

	public Elevator(){}

	public Elevator(ElevatorType type, ElevatorStatus status){
		this.currentFloor = 0;
		this.currentPassengerWeight = 0;
		this.type = type;
		this.status = status;
		this.direction = ElevatorDirection.STAND;
		//this.floorRequests = new ArrayList<Integer>();
		this.passengers = new ArrayList<Passenger>();
		this.weightLimit = 0;
		//this.passengerCount = 0;
	}
}


class AccessLevelNode{
	public AccessGroup group;
	public int AccessId;

	public AccessLevelNode(AccessGroup group){
		this.group = group;
		this.AccessId = 0; // Auto generate id;

	}

}


class Passenger {
	public int floorRequest;
	public ElevatorType elevatorType;
	public int currentFloor;
	public int weight;
	public AccessLevelNode accessLevel;

	public Passenger(int floorRequest, int currentFloor, AccessLevelNode access, int weight, ElevatorType type){
		this.floorRequest = floorRequest;
		this.currentFloor = currentFloor;
		this.accessLevel = access;
		this.weight = weight;
		this.elevatorType = type;
	}


}


// Enums :
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

enum AccessGroup {
	ALL_ACCESS, LIMITED_ACCESS
}

enum ElevatorType {
	PUBLIC, FREIGHT
}

enum FloorType {
	BASEDMENT, WINDOW_FLOOR
}

enum ElevatorDirection {
	UP, DOWN, STAND, MAINTENANCE
}

enum ElevatorStatus {
	ON, OFF
}




