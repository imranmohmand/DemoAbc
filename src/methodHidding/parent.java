package methodHidding;

public class parent {
	static void hello() {
		System.out.println("Hello from super class");
	}

}

class Child extends parent{
	static void hello() {
		System.out.println("Hello from super class");
	}
	
}
