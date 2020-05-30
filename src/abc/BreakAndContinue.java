package abc;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=0;i<=10;i++) {
//			if(i==2) {
//				break;
//			}System.out.println(i);
//		}
//		System.out.println("i am outside of loop");
		
		
		/*
		 *nevigate to the syntax page
		we fount 7NumLinks
		for(LinkName.equals"sign Up"){
		click;
		break;
		}else{
		do nothing
			}
		 */
		
		
		
					//***** continue -it will skip current iteration
		
//		for(int i=0;i<=5;i++) {
//			if(i==3 || i==4) {
//				continue;
//			}System.out.println(i);
//		}
//		System.out.println("i am outside of the loop");
		
		
		
		
		//*******Task**********  print number from 1 to 50 except those that are divisible by 3

		
//		for(int i=1;i<=50;i++) {
//			if(i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		
		/*  ***** create a program that will be asking user to apply for credit card 10 times.
		as soon you get an "yes" from a user program should be stop asking
		*/
		String card; 
		Scanner scanner=new Scanner(System.in);
		 for(int i=1;i<=10;i++) {
			 System.out.println("are you applying for cradit card");
			 card=scanner.nextLine();
			 if(card.equalsIgnoreCase("yes")) {
				 break;
			 }
			 System.out.println(card);
		 }
		 
		
		
	}

}
