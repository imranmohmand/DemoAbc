package polyMorphism;

import thisKeyWord.ThisKey;

public class InterviewsQuestionsMethodOverLoading {
	
	//can we overload private method----> yes
	private void method1() {
		
		System.out.println("i am method1");
	}
	private void method1(String str) {
		
		System.out.println("i am metohd1 with string" + str);
		
	}
	
	protected void name() {
		System.out.println("hello");
	}
	protected void name(String he) {
		System.out.println("helloooo"+he);
	}
	
	//can we overload the main method ---------> yes
	 public static void main(String str) {
		 System.out.println("i am main method with String argument");
		 
	 }
	 public static void maint(String str,String[] args) {
		 System.out.println("i am main method with 2 parameter");
	 }
	 public static void main(String[] args) {
		 System.out.println("this is the main method with array String");
		 main("string");
		 
		//calling method line 13
		 String[] array= {"A","B"};
		 maint("string", array);
		 
		 
		 InterviewsQuestionsMethodOverLoading obj=new InterviewsQuestionsMethodOverLoading();
		 obj.method1("string");
		 
		 
		 obj.name("string");
	}
	

}
