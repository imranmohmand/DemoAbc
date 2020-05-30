package variablePackase;

public class LocalAndInstanceVariableWithSameName {
	
	//instance variable
	String name="sumair";

	//Static variable (common information)// common property
	 static int eyes=2;
	 static int nose=1;
	 static boolean brain=true;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="khan";
		System.out.println("this is local variable "+name);//local variable to this method
		
		System.out.println();
		
		LocalAndInstanceVariableWithSameName obj=new LocalAndInstanceVariableWithSameName();
		System.err.println("this is instance variable "+obj.name);
		
		obj.name="wawaKhan";
		System.out.println(obj.name);//now the value of instance variable change
		
		
		LocalAndInstanceVariableWithSameName obj1=new LocalAndInstanceVariableWithSameName();
		
		System.out.println(obj1.name);//this will referred to the instance agine 
		//because we change only in the copy not in instance
		
		
		//static variable to class
		System.out.println("printing static variable");
		System.out.println(obj.eyes);//called through object
		System.out.println(LocalAndInstanceVariableWithSameName.eyes);//directly call with ClassName
		System.out.println(eyes);
		
		

	}

}
