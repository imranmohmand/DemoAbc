package abstrcution;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * how can you create an object when your parent class is undefined(some method is undefined)
		 * so can we create an object when our class is undefined
		 * no-only when your class is  100% define than  you can create an object.because you as self don't know about the undefined method.
		 * so how can you create an object ?
		 * we can create it indirectly  call it by its child class with the reference of parent class
		 */
		
		//****************************************
		//you cannot directly create an object of abstract class
		//phone phone=new phone(); cannot instantiate

		//we can create it indirectly  
		Phone phone=new iPhone();//here we call child class iPhone and gave reference of its parent class to access all method
								//whether implemented or unimplemented
		phone.makeCall();
		phone.sendText();
		phone.takePicture();
		phone.playGame();

	}

}
