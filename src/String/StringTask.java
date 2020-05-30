package String;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		/*
		 * accept username,password and confirm password and check following  requirement:
1 username and password cannot be empty,if so-> message="username and password cannot be empty".
2 password should be minimum 8 characters,if less -> message="password is too short".
3 password cannot contain username if so-> messagae="password cannot contain username".
4 password should match confirmed password,if not -> message="passwords do not match".
5 only after all requirements met -> message="your username and password has been created"


		 */ 
		Scanner scan =new Scanner(System.in);
		
		String  UserName,Password,ConfirmPassword,Message;
		System.out.println("please enter your username");
		UserName=scan.nextLine();
		System.out.println("Please enter your password");
		Password=scan.nextLine();
		System.out.println("Please confirmed password");
		ConfirmPassword=scan.nextLine();
		
		if(!(UserName.isEmpty() && Password.isEmpty())) {
			if(Password.length() >8) {
				if(!Password.contains(UserName)) {
					if(Password.equals(ConfirmPassword)) {
						Message="your username and password has been created";
					}else {
						Message="passwords do not match";
					}
					
				}else {
					Message="password cannot contain username";
				}
				
			}else {
				Message="password is too short";
				}
			
		}else {
			Message="username and password cannot be empty";
		}
		
		System.out.println(Message);
		


	}

}

						//Same copy

/*		
		Scanner scan;
		String userName,password,confirmedPassword ,Message;
		 
		scan=new Scanner(System.in);
		System.out.println("please enter your username");
		userName=scan.nextLine();
		System.out.println("please enter your password");
		password=scan.nextLine();
		System.out.println("please confirmed password");
		confirmedPassword=scan.nextLine();
		
		
		if(!(userName.isEmpty() && password.isEmpty())) {
			
			if(password.length()>8) {
				if(!password.contains(userName)) {
					if(password.equals(confirmedPassword)) {
						Message="your username and password has been created"; }
					else {
						Message="passwords do not match";
					}
					
				     }else {
					Message="password cannot contain username";
				}
					
				}else {
				Message="password is too short";
			}
			
		}else {
			Message="username and password cannot be empty";
			
	}
		
		System.out.println(Message);
*/