package ClassAndObject;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Task1 {
	
	//create a method that  will take 2 parameters as a numbers and print which number is  larger.
	int number1;
	int number2;
	void numbers(int number1,int number2) {
		
		if(number1>number2) {
			System.out.println("the larger number is "+ number1);
		}else if(number1<number2) {
			System.out.println("the larger number is "+ number2);
		}else {
			System.out.println("the number are equalls");
		}
	}
	
	//2 create a method that will take 2 number and print whether the number is even or odd
	
	
	void evenOrodd(int number) {

		if(number%2==0) {
			System.out.println(+number+ " is even");
		}else {
			System.out.println(+number+ " id odd");
		}
	}

	//3 create a method that will  print whether given string is palindrome or not.
	
	void palindrome(String word) {
		 
		String reverse="";
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		if(word.equals(reverse)) {
			System.out.println("the word is palindrome");
		}else {
			System.out.println("the word is not palindrome");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task1 task=new Task1();
		task.numbers(399, 390);
		task.numbers(200, 300);
		task.numbers(200, 200);
		
		
		task.evenOrodd(22);
		
		task.palindrome("madam");
		task.palindrome("nursesrun");
		task.palindrome("hello");


	}

}
