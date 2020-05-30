package accessModifiers;

public class TestModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// can access any class but within the package
		AccessModifiersMethod.publicHello();
		AccessModifiersMethod.Defaulthello2(); // can access any class but within the package
		AccessModifiersMethod.Protectedhello1();// can access any class but within the package
		//AccessModifiersMethod.privateHello   cannot be access // Access to the same class only
		

	}

}
