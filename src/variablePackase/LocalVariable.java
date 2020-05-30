package variablePackase;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i want to access a variable from different method
		
		LocalVariable obj=new LocalVariable();
		obj.sayName();// wont accessible because the scope  is only within sayName
					//System.out.println(myNameString);
		
		String userEmailString=obj.createEmail("imran", "khan", "outlook");
		System.out.println(userEmailString);
		//this userEmail(local variable) is local to this main method
		

	}
	void sayName() {
		String myNameString="john"; // 
		System.out.println(myNameString);
	}
	String createEmail(String userName,String LastName,String email) {
		String userEmailString=userName+LastName+"@"+email+".com";
		//this userEmail(local Variable) is local to this main method
		return userEmailString;
	}

}
