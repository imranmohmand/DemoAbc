package abc;

import java.util.Scanner;

public class face {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num1, num2; int total = 0;
		char opt;
		
		System.out.println("please enter the first number");
		num1=scan.nextInt();
		System.out.println("please enter the operator");
		
		
		opt=scan.next().charAt(0);
		System.out.println("please enter the second number");
		num2= scan.nextInt();
		
		switch (opt) {
		case '*':
			total=num1 *num2;
			
			break;
		case '/':
			total= num1/num2;
			break;
		case '+':
			total= num1+num2;
			break;
		case '-':
			total = num1-num2;
			break;
			

		default:
			System.out.println("please enter correct operator");
			break;
			
			
			
		}
		
		System.out.println("the total is " + total);
		
		

	}

}
