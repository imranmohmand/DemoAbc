package String;

public class IQquestionSwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		write a program to swap 2 numbers without a temporary variable?
		swap 2 strings without a temporary variable
		*/
		
		int a=10;
		int b=20;
		a=a+b; //30
		b=a-b;//30-20
		a=a-b;//30-10 because now the b hold value 10
		System.out.println("the value of a "+a);
		System.out.println("the value of b "+b);
		
		
		String str="hello";
		String str1="bye";
		str=str+str1; // hellobye
		 str1=str.substring(0,5);
		 str=str.substring(5,8);
		 System.out.println("the value of str "+str);
		 System.out.println("the value of str1 "+str1);
		

	}

}
