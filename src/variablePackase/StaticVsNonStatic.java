package variablePackase;

public class StaticVsNonStatic {
	//template for school(school,name,grade)
	
	//static variable
	static String school="syntax";
	
	// instance variable
	String name;
	char grade;
	
	//instance method or non static method
	void getInfo() {
		System.out.println("my name is "+name+" and my school name is "+school+"and i read in grade "+grade);
		
	}
	//static method
	static void getInfo1() {
		System.out.println("i am attending school at "+school);
	}

}
