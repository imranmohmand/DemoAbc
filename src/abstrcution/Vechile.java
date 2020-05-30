package abstrcution;

public abstract class Vechile {
	public void drive() {
		System.out.println("vechile can drive");
	}
	public void stop() {
		System.out.println("vechile can stop");
	}
	
	//unimplemented method 
		//if you don't know the behavior of this method so make it abstract 
		// as soon you define a method(abstract) is undefined than change your class also abstract 
	public abstract void start();
	public abstract void speed();

}
abstract class car extends Vechile{
	public void speed() {
		System.out.println("the max speed up tp 400");
	}
	//you can define abstract method to child class as well
	public abstract void breaking();
	
}

// this is concrete class be it define all the unimplemented method
class BMW extends car{

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}

