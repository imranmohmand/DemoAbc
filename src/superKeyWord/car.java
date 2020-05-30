package superKeyWord;

public class car {
	String make,model;
	
	car(){
		System.out.println("i am non arguement constructor");
	}
	car(String make,String model ){
		this.make=make;
		this.model=model;
		
		
	}

}

class tesla extends car{
	boolean autopilot;
	 
	
	tesla(){//default constructor can be added if you did not specified with the super(); keyword
		super();
		System.out.println(" i am child class constructor without arguements");
	}
	tesla(String make,String model,boolean autopilot){
		
		super(make,model);
		this.autopilot=autopilot;
		
	}
	public void displayInfo() {
		System.out.println("car" +make+ " " +model+" has an autopilot "+ autopilot );
	}
}
