package ClassAndObject;

public class ObjectOfComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer computer1=new Computer();
		computer1.brand="macbook";
		computer1.name="apple";
		computer1.keyboard="ab";
		computer1.screen=15;
		computer1.memory=256;
		
		
		// Accessing behaviors 
		 computer1.open();
		 computer1.coding();
		 computer1.watchingmovies();
		
		Computer computer2=new Computer();
		computer2.brand="Hp";
		computer2.name="Window";
		computer2.keyboard="cd";
		computer2.screen=15;
		computer2.memory=256;
		computer2.brand="thinkerPaid"; //now we change the variable 
		
		//accesing behaviours
		 computer2.open();
		 computer2.coding();
		 computer2.watchingmovies();
		
		System.out.println("the brand is "+computer1.brand );
		
		System.out.println("the brand is "+computer2.brand);
		

	}

}
