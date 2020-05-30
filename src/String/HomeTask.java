package String;

import java.util.Scanner;

public class HomeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		write a program that reads two people's first names
		and if they expecting boy or girls?
		based on the input suggests a name for a baby
		*/
		
		Scanner scan;
		String MotherName,FatherName,Gender,BabyName; 
		scan=new Scanner(System.in);
		
		System.out.println("please enter mothername");
		MotherName=scan.nextLine();
		
		System.out.println("please enter FatherName");
		FatherName=scan.nextLine();
		
		System.out.println("please enter expected Gender");
		Gender=scan.nextLine();
		
		
		if(Gender.equalsIgnoreCase("boy")) {
			BabyName=FatherName.substring(0,FatherName.length()/2)+ MotherName.substring(MotherName.length()/2);
		}else if(Gender.equalsIgnoreCase("girl")) {
			BabyName=MotherName.substring(0,MotherName.length()/2)+FatherName.substring(FatherName.length()/2);
		}else {
			BabyName="no suggestion";
			
		}
		System.out.println(BabyName.toUpperCase());

	}

}
