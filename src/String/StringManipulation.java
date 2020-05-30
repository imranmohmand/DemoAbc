package String;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count the string
		String str="syntax";
		int count=str.length();
		System.out.println(count);
		
		
		String str1="syntax technologies";
		int count1=str1.length();
		System.out.println(count1);

		String str2="welcome, students!";
		System.out.println(str2.length());
		
		// conversion
		String  str3="hello";
		String upper=str3.toUpperCase();
		System.out.println(upper);
		//LowerCase
		String str4="HELLO";
	String lower=str4.toLowerCase();
	System.out.println(lower);
	
	
	//Comparing two strings
	
	String a="Hello";
	String b="hello";

     boolean compare=a.equals(b);
     System.out.println(compare);
     boolean ignorecase=a.equalsIgnoreCase(b);
     System.out.println(ignorecase);
     
     String ExpectedBrowser="chrome";
     String ActualBrowser="chrome";
     if(ExpectedBrowser.equals(ActualBrowser)) {
    	 System.out.println("pass");
     }else {System.out.println("fail");
     
     }
		
	}

}
