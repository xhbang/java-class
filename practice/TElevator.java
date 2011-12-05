import java.util.*;


public class TElevator{
	//attributes
	public int ElevatorID;
	public int ElevatorStatus;
	public int Load;
	public int MaxLoad;
	List<Person> PassengerList;
	List<Integer> upStoplist;
	public int Possition;
	
	
	//operation
	void addStoplist(){
		
	}
	void change(){
		
	}
	void ContinueRun(){
		
	}
	Boolean isEmpty(){
		return true;
	}
	Boolean isEmptyStoplist(){
		return true;
	}
	void open(){
		
	}
	void setIdle(){
		
	}
	
}

class Person{
	//attributes
	public int PersonStatus;
	public int RequestFloor;
	public int EnterTime;
	
	//operations
	void offElevator(){
		
	}
	void onElevator(){
		
	}
}

class CreatePerson{
	//attributes
	public int CreatedNumber;
	public int NumPerSecond;
	
	//operations
	void Execute(){
		
	}
}

class TSystemControl{
	//attributes
	public int NumToWaited;
	
	
	//operations
	void AlterStoplist(){
		
	}
	void CreateCalllist(){
		
	}
	void Execute(){
		
	}
	void Wake(){
		
	}
}