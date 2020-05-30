package abstrcution;

public class VechileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//now we will need one class which will provide the definition 
		
		//you cannot directly create an object of abstract class
		//vehicle Vehicle=new phone(); cannot instantiate

		//you can assign either  child or parent
		
		car car=new BMW();
		car.drive();
		car.stop();
		car.speed();
		car.start();
		car.breaking();
		//you can give reference or assign to parent class
		
		System.out.println("*******************");
		Vechile vechile=new BMW();
		vechile.drive();
		vechile.stop();
		vechile.speed();
		vechile.start();
		
		

	}

}
