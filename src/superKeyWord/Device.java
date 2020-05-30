package superKeyWord;

public class Device {
	String deviceType;//we can used this with help of constructor to initialize it
	String name;
	
	public Device(String deviceType,String name) {
		this.deviceType=deviceType;
		this.name=name;
		
		
	}

}

class Apple extends Device{

	public Apple(String deviceType, String name) {
		
		//super() super always be at 1st line of the constructor if you initialize constructor
		super(deviceType, name);
		//you can call superKeyword only inside in a constructor 
		
	}
	
	
	
}