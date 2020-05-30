package variablePackase;

public class InstanceVariable {
	String firstName;
	String lastNameString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance variable each method will get a cope but it will not effect 
		//the original variable
		
		InstanceVariable obj=new InstanceVariable();
		obj.firstName="ail";
		obj.lastNameString="khan";
		System.err.println(obj.lastNameString);
		
		InstanceVariable obj1=new InstanceVariable();
		obj1.firstName="khan";
		obj1.lastNameString="jan";
		obj1.lastNameString="wowa";
		System.err.println(obj1.lastNameString);		

	}

}
