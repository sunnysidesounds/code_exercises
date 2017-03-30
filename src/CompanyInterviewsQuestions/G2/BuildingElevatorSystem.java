package CompanyInterviewsQuestions.G2;

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

		Passenger passenger1 = new Passenger(50, 2, new AccessLevelNode(AccessGroup.LIMITED_ACCESS), 50, ElevatorType.PUBLIC);
		Passenger passenger2 = new Passenger(5, 2, new AccessLevelNode(AccessGroup.LIMITED_ACCESS), 50, ElevatorType.PUBLIC);

		elevatorManager.makeFloorRequest(passenger1);
		elevatorManager.makeFloorRequest(passenger2);

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
	public Map<ElevatorType, Elevator> elevatorTypeMap;

	public ElevatorManager(Building building){
		this.building = building;
		this.elevatorTypeMap = new HashMap<ElevatorType, Elevator>();
		this.initalizeManager();
	}

	public void initalizeManager(){
		for(Floor f : this.building.floors){
			if(f.elevatorOnFloor != null){
				this.elevatorTypeMap.put(f.elevatorOnFloor.type, f.elevatorOnFloor);
			}
		}
		this.processElevatorRequest();
	}

	public void makeFloorRequest(Passenger passenger){
		// Make the request to the approprate elevator.
		if(this.elevatorTypeMap.containsKey(passenger.elevatorType)){
			System.out.println("Passenger requests to go to : " + passenger.floorRequest);
			Elevator selectedElevator = this.elevatorTypeMap.get(passenger.elevatorType);
			selectedElevator.passengers.add(passenger);
			this.processElevatorRequest();
		} else {
			System.out.println("Could not find elevator!");
		}
	}

	public void processElevatorRequest(){
		for(Elevator elevator : this.building.elevators){
			while(!elevator.passengers.isEmpty()){
				Passenger passenger = elevator.passengers.peek();
				int floorRequest = passenger.floorRequest;
				if(elevator.currentFloor < floorRequest){
					moveElevatorUp(elevator, floorRequest);
				} else if (elevator.currentFloor > floorRequest){
					moveElevatorDown(elevator, floorRequest);
				}
			}
		}
	}

	public void moveElevatorDown(Elevator elevator, int floorRequest){
		if(floorRequest <= this.building.floors.size()) {
			for (int i = elevator.currentFloor; i >= floorRequest; i--) {
				System.out.println("Moving down " + i);
				elevator.direction = ElevatorDirection.DOWN;
				moveElevator(elevator, floorRequest, i);
			}
		} else {
			System.out.println("You've request a floor out of bounds");
		}
	}

	public void moveElevatorUp(Elevator elevator, int floorRequest){
		if(floorRequest <= this.building.floors.size()) {
			for(int i = elevator.currentFloor; i<=floorRequest; i++){
				System.out.println("Moving up " + i);
				elevator.direction = ElevatorDirection.UP;
				moveElevator(elevator, floorRequest, i);
			}
		} else {
			System.out.println("You've request a floor out of bounds");
		}
	}

	private void moveElevator(Elevator elevator, int floorRequest, int currentFloor){
		if(currentFloor == floorRequest){
			Passenger passenger = elevator.passengers.remove();
			Floor floor = this.building.floors.get(floorRequest-1);
			// Check Floor Access only on LIMIT_ACCESS floors
			if(floor.floorAccessLevel.group == AccessGroup.LIMITED_ACCESS){
				if(passenger.accessLevel.group == floor.floorAccessLevel.group) {
					System.out.println("Access granted adding passenger to floor " + floor.levelLocation);
					elevator.direction = ElevatorDirection.STAND;
					elevator.currentFloor = currentFloor;
					floor.addPassengerToFloor(passenger);
				} else {
					System.out.println("Passenger does not have access! " + passenger.accessLevel.group);
					// Need new request from passenger
				}
			} else {
				System.out.println("Adding passanger to floor " + floor.levelLocation);
				elevator.direction = ElevatorDirection.STAND;
				elevator.currentFloor = currentFloor;
				floor.addPassengerToFloor(passenger);
			}
		}
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
		this.passengers.add(passenger);
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
	public Queue<Passenger> passengers;
	public int weightLimit;

	public Elevator(ElevatorType type, ElevatorStatus status){
		this.currentFloor = 0;
		this.currentPassengerWeight = 0;
		this.type = type;
		this.status = status;
		this.direction = ElevatorDirection.STAND;
		this.passengers = new LinkedList<Passenger>();
		this.weightLimit = 0;
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




