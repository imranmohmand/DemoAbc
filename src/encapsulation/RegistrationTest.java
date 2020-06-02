package encapsulation;
/*
create  registration class in which you would have variables 
*as email,userName and password that have an access scope only within its own class.
*after creating an object of the class user should be able 
*to call methods and in each method separately pass values
*to set users email,userName and password.
Requirements:
valid email consider to be only Gmail
valid userName and password cannot be empty and
should be of length larger than 6 characters.
also valid password cannot contain userName.
*/



class registrionClass{
	private String email,userName,password;// we make it private because we want  access it only at class level
	
	//setting email because i don't want give access to anyone to my variable so if they want they can access through only setter 
	//getter
	public void setEmail(String email) {
		if(email.contains("gmail.com")) {
			this.email=email;
		}else {
			System.out.println("invalid email type.email must be gmail ");
		}
		
	}
	//getting email
	public String getEmail() {
		return email;
	}
	
	//setter UserName
	public void setUserName(String userName) {
		if(!userName.isEmpty()) {
			if(userName.length()>6) {
				this.userName=userName;
				
			}else {
				{
					System.out.println("the UserName must be greater than 6 characters");
				}
			}
			
		}else {
			System.out.println("userName cannot be empty");
		}
	}
	//getting userName
	public String getUserName() {
		return userName;
	}
	//sett password
	public void setPassword(String Password) {
		if(!password.isEmpty()) {
			if(password.length()>6) {
				if(!password.contains(userName)) {
					this.password=password;
					
				}else {
					System.out.println("the password cannot contain userName");
				}
				
			}else {
				System.out.println("the password must be greater than 6 characters");
			}
			
		}else {
			System.out.println("password cannot be empty");
		}
		
	}
	//getting password
	public String getPassword() {
		return password;
	}
}

public class RegistrationTest {
	public static void main(String[] args) {
		registrionClass obj=new registrionClass();
		obj.setUserName("khan");
		System.out.println(obj.getUserName());
		
	}

}
