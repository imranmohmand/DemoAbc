package variablePackase;

public class CallingStaticVsNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling static method
		StaticVsNonStatic.getInfo1();
		
		
		// calling non static method
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.name="ali";
		obj.grade='A';
		obj.getInfo();

	}

}
