package interfacePackage;

public interface Drivable {
	
	//public static final variable will be added by default
	boolean DRIVE_FAST=	true;//constant variable are written using upper case,naming convention will be preferable 
	//by default  compiler will add public abstract to the method
	void drive();

}

class Toyota extends cars implements Drivable{

	@Override
	public void drive() {
		System.out.println("toyota  can driver");
		
	}
}
		//here is the question why do we need interface.if we have another class like cars
		// and we want to have extract some data from interface and cars class
		// so this can be done by  interface we can have multiple inheritance

//class to class relationship create by extends keyword
// class to interface we will use implement keyword
class cars{
	public void stop() {
		System.out.println("car can stop by pressing breaks");
	}
}