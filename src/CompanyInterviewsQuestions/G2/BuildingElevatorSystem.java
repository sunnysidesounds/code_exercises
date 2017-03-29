package CompanyInterviewsQuestions.G2;

import javax.lang.model.element.ElementVisitor;
import java.util.ArrayList;
import java.util.List;

public class BuildingElevatorSystem {
}


class BuildingFactory {

	public static Building constructBuilding(String name, int floorCount){
		// Build out our basement and window floors
		List<Floor> floors = new ArrayList<Floor>();
		floors.add(new BasementFloor()); // assuming basement is on floor zero.
		for(int i = 1; i <= floorCount; i++){
			floors.add(new WindowFloor(i));
		}

		List<Elevator> elevators = new ArrayList<Elevator>();
		elevators.add(new PublicElevator());
		elevators.add(new FreightElevator());
		return new Building(name, floors, elevators);

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


class WindowFloor extends Floor {
	public WindowFloor(int level){
		super(level, FloorType.WINDOW_FLOOR, new AccessLevelNode(AccessGroup.ALL_ACCESS));
	}
}


class BasementFloor extends Floor {
	public BasementFloor(){
		// assuming level 0 is basement
		super(0, FloorType.BASEDMENT, new AccessLevelNode(AccessGroup.LIMITED_ACCESS));
	}
}


class Floor {

	public int levelLocation;
	public FloorType type;
	public AccessLevelNode floorAccessLevel;

	public Floor(int level, FloorType type, AccessLevelNode access){
		this.levelLocation = level;
		this.type = type;
		this.floorAccessLevel = access;
	}

	public void setFloorAccess(AccessGroup access){
		this.floorAccessLevel.group = access;
	}

}


// Elevators

class ElevatorSystem {

	
}


class PublicElevator extends Elevator {
	public PublicElevator(){
		super(ElevatorType.PUBLIC, ElevatorStatus.ON);
	}
}

class FreightElevator extends Elevator {
	public FreightElevator(){
		super(ElevatorType.FRIEGHT, ElevatorStatus.ON);
	}
}



class Elevator {

	public int currentFloor;
	public ElevatorType type;
	public ElevatorDirection direction;
	public ElevatorStatus status;
	public List<Integer> floorRequests;
	public List<Passenger> passengers;
	public int weightLimit;
	public int passengerCount;

	public Elevator(){}

	public Elevator(ElevatorType type, ElevatorStatus status){
		this.currentFloor = 0;
		this.type = type;
		this.status = status;
		this.direction = ElevatorDirection.STAND;
		this.floorRequests = new ArrayList<Integer>();
		this.passengers = new ArrayList<Passenger>();
		this.weightLimit = 0;
		this.passengerCount = 0;
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
	int floorRequest;
	AccessLevelNode accessLevel;

}


// Enums :
enum AccessGroup {
	ALL_ACCESS, LIMITED_ACCESS
}

enum ElevatorType {
	PUBLIC, FRIEGHT
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




