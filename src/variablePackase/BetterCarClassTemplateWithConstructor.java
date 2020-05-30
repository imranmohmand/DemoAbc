package variablePackase;

public class BetterCarClassTemplateWithConstructor {
	static String make;
	public String model;
	public String color;
	public int speed;
	public int windows;
	
	BetterCarClassTemplateWithConstructor(String carModel,String carColor,int CarSpeed,int CarDoor){
		model=carModel;
		color=carColor;
		speed=CarSpeed;
		windows=CarDoor;
	}
	
	public static void main(String[] args) {
		
		make="BMW";
		
		//BetterCarClassTemplateWithConstructor bcar1=new BetterCar();//it shoud be pass all parameter declared in a constructor
		/* //compiler will give an error,we have to pass values when we  build a
		 * //those values will be passed as arguments to the constructor
		 * //through constructor instance variable will get initialized
		 */
		BetterCarClassTemplateWithConstructor bcar1=new BetterCarClassTemplateWithConstructor("X5", "white", 400, 2);
		bcar1.getDetails();
		
		
		 
	}
	
	public void getDetails() {
		System.out.println("i bulid "+color+" "+make+" "+ model);
		System.out.println("My car has  "+windows+" door and can speed "+speed);
	}

}
