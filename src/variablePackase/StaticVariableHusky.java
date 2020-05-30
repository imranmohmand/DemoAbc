package variablePackase;

public class StaticVariableHusky {
	
	//static variable because the common information or common property are
	//the database will be static through out the project so make it static
	static String breed="husky";
	static int paws=4;
	static int tail=1;
	
	
	//instance variable
	
	String name;
	String color;
	
	void display() {
		System.out.println(" the dog name "+name+ "and breed is "+breed);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariableHusky obj=new StaticVariableHusky();
		obj.name="meatboll";
		obj.color="brown";
		obj.display();
		
		
		StaticVariableHusky obj1=new StaticVariableHusky();
		obj1.name="shayan";
		obj1.color="black";
		obj1.display();
		
		//if i change the breed which is a static variable what happen it will change breed in all copy
		//because of this comon location,if one object  changes the value of a static  variable,
		//all objects of the same class are affected.
		System.out.println("after changing breed");
		StaticVariableHusky obj3=new StaticVariableHusky();
		obj3.name="shayan";
		obj3.color="black";
		obj3.breed="BullDog";//now breed change the copy of it will also change after this
		obj3.display();

	}

}
