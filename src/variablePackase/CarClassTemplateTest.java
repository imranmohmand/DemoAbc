package variablePackase;

public class CarClassTemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaeClassTemplate.make="Toyota";
		
		// we can eliminate this amount of code by using constructor
		
		CaeClassTemplate obj=new CaeClassTemplate();
		obj.model="camery";
		obj.color="black";
		obj.speed=200;
		obj.windows=4;
		
		obj.getDetails();
		
		
		CaeClassTemplate obj1=new CaeClassTemplate();
		obj1.model="camery";
		obj1.color="blue";
		obj1.speed=150;
		obj1.windows=4;
		obj1.getDetails();
		
		
		
		CaeClassTemplate obj2=new CaeClassTemplate();
		obj2.model="prius";
		obj2.color="green";
		obj2.getDetails();
		//the console will assign the rest of variable zero because we did not specifies
		
		
		
		// constructor can initialize instance variable
		//create an object of betterCar class
		BetterCarClassTemplateWithConstructor bettercar=new BetterCarClassTemplateWithConstructor("Toyota", "white", 200, 5);
		bettercar.getDetails();

	}

}
