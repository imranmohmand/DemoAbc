package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child1=new Child1();
		System.out.println(child1.raceString);
		System.out.println(Child1.hairColString);
		System.out.println(Child1.eyeColorString);
		
		child1.sing();
		child1.coding();
		
		
		// if i directly access through parent
		 Parent parent1=new Parent();
		 System.out.println(parent1.raceString);
		 System.err.println(parent1.hairColString);
		 System.err.println(parent1.eyeColorString);
		 parent1.sing();
		 
		 //parent1.coding() compiler will gave us an error because parent cannot inherent from child
		 

	}

}
