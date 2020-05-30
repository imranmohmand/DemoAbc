package ClassAndObject;

public class HelloParameterWithString {

	void sayhello(String name) {
		System.out.println("hello " +name);
	}
	
	/* create a method that will say hello in different languages 
    base on the value that will be passed when user calls methods
	 */
	void sayhelloInDifferendLanguage(String countryString) {
		
	
		switch (countryString.toLowerCase()) {
		case "USA":
			System.out.println("hello");
			
			break;
		case "Russia":
			System.out.println("privet");
			break;
		case "paraguay":
			System.out.println("hola");
			break;
		case "Afghanistan":
			System.out.println("Staremashy");
			break;
			

		default:
			System.out.println("i donot know how to say hello in your language");
			break;
		}
		
	}
	
	
	// method to say name and age
	void sayNameAndAge(String name,int age) {
		System.out.println("my name is "+ name+ " and i am " +age + " year old");
	}
	
	
	//create a methof that will check if it snowing 
	//if snow --> stay at home,otherwise go for walk
	
	void isSnow(boolean isSnowing) {
		if(isSnowing) {
			System.out.println("stat at home");
		}else {
			System.out.println("go out for walk");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloParameterWithString obj=new HelloParameterWithString();
		obj.sayhello("aimal");
		obj.sayhello("khushhal");
		
		obj.sayhello("Jabir");
		
		
		
		obj.sayhelloInDifferendLanguage("Afghanistan");
		obj.sayhelloInDifferendLanguage("inda");
		
		
		obj.sayNameAndAge("Romasa", 5);
		obj.sayNameAndAge("Aimal", 11);
		
		//obj.sayhelloInDifferendLanguage(123);  ---> you will get compiler time error
		
		obj.isSnow(false);
		
	}
	
}
