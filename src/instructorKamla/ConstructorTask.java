package instructorKamla;

public class ConstructorTask {
	// this is instance variable which is inside the class but outside of the method
	int id;
	String nameString;
	//here we declared the static variable with the static keyword
	 static String nameString2;
	 
	 public ConstructorTask(int i ,String n){//thats constructor with the parameterized/arguments
		 id=i;
		 nameString=n;
	 }
	 //method which has student details without parameterized
	 public void studentDetail() {
		 System.out.println(id+ " "+nameString);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// here we initialize the contractor //create an object of instructor
		ConstructorTask obj=new ConstructorTask(2, "khan");
		 obj.studentDetail();//this the method we call through object 
		

	}

}
