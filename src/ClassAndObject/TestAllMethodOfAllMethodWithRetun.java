package ClassAndObject;

public class TestAllMethodOfAllMethodWithRetun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the largest number from 300 and 500
		// then identify the largest number is odd or not
		
		AllMethodWithRetun ob=new AllMethodWithRetun();
		int larger= ob.findLargest(300, 500);
		System.out.println(larger);
		
		boolean IsOdd=ob.IsOdd(larger);
		System.out.println(IsOdd);
		
		////call method WeekName
		// if(out is Tuesday,Wednesday,Thursday)--> i am learning java
		String day =ob.WeekDayName(2);
		if (day.equalsIgnoreCase("tuesday") ||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("Thursday"))
{System.out.println(" i am learning java");}else {
	System.out.println("i am practing java");
}
	}
	

}
