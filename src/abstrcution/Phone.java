package abstrcution;

public abstract class Phone {
	
	//implemented method
	//any method that have body we called it method with implementation detail or with implement login

	public void makeCall() {
		System.out.println("make call");
	}
	public void sendText() {
		System.out.println("send text");
	}
	//unimplemented method 
	//if you don't know the behavior of this method so make it abstract 
	// as soon you define a method (abstract) is undefined than change your class also abstract 
	public abstract void takePicture();
	
	//do not know hoe this method will behave
	
	public abstract void playGame();
	

}

class iPhone extends Phone{

	@Override
	public void takePicture() {
		System.out.println("iPhone takes picturs");
		
	}

	@Override
	public void playGame() {
		System.out.println("plays game on iPhone");
		
	}
	
}
class samSung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("samsung takes picturs");
		
	}

	@Override
	public void playGame() {
		System.out.println("plays game on samsung");
		
	}
	
}

