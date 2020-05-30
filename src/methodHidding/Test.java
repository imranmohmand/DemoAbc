package methodHidding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p=new Child();//create an object of child class and give reference of parent class
		
		p.hello();//this will called method in the parent class rather than called method in the child class as method overriding
				// did but in this case the child method is static that is why it is hidden
				//if you want to access to child class hello() method so remove static from the both methods  so you can access 
		//so static will hidden method in child class,
		//so we will not achieving method overriding we will achieve method hiding 

	}

}
