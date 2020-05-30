package variablePackase;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no need to create an object of that class just called through className.StaticVariableName();
		System.out.println(StaticVariableHusky.breed);
		
		
		
		//any time you want to access instance variable you will have to create an instance of that class
		StaticVariableHusky obj=new StaticVariableHusky();
		System.out.println(obj.name="bulldog");

	}

}
