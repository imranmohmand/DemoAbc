package superKeyWord;

public class Building {
	
	String address; //without parameterize constructor the compiler will create default constructor and initialize null value
	int floor; // null//
	
	
	Building(String address,int floor) {
		this.address=address;
		this.floor=floor;
	}
//	Building() {//if i create an non argument constructor it will provide null value 
//		
//	}// pointless constructor if we don't have compiler will generate a default one
//	
	

}
