package superKeyWord;

public class BuildingRoom extends Building{
	int roomNumber;
	
	BuildingRoom(String address, int floor,int roomNumber) {
		super(address, floor);
		this.roomNumber=roomNumber;
	}
	
	public void print() {//this method we create only to print the result
		System.out.println(address+" "+floor+" "+roomNumber);
	}

	
	
	public static void main(String[] args) {
		BuildingRoom object=new BuildingRoom("123 test drive", 12, 120); // it will print when we have printLn so crate a method also
		object.print();
		
		
		
		
	}
}
