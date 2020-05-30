package String;

public class StringManipulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="good morning, student!";
		boolean yes=str.contains("good");
		System.out.println(yes);
		
		
		// another
		System.out.println("------------ Anotherway---------");
		String expect="Welcome, guys";
		String actul="Welcome,";
		boolean flag=expect.contains(actul);
		System.err.println(flag);
		boolean flag1=expect.toLowerCase().contains(actul); //false beacse first we converted to lower case than check contain
		System.out.println(flag1);
		
		
		
		
		//String 
		System.out.println("---------check startWith-------------");
		String name="Syntax";
		boolean check=name.startsWith("S");
		System.out.println(check);
		System.out.println("---------check EndWith-------------");
		boolean end=name.endsWith("x");
		System.out.println(end);
		
		
		System.out.println("---------isEmpty-------------");
		String st="hello";
		boolean empty=st.isEmpty();
		System.out.println(empty);
		
		String st1="";
		boolean emp=st1.isEmpty();
		System.out.println(emp);
		
		
		System.out.println("---------concatenating-------------");
		
		String stringgreeting="hello";
		String stringname="Ali";
	//	System.out.println(stringgreeting+" " +stringname);
		System.out.println(stringgreeting.concat(stringname));
		
		
		System.out.println("---------Trim-------------");
		// it will remove space from the begging an at the end
		String exp="More than just car insurance";
		String act=" More than just car insurance ";
		
		System.out.println(exp.equals(act));
		
		System.out.println("after trim");
		
		act=act.trim();
		System.out.println(exp.equals(act));
		

	}

}
