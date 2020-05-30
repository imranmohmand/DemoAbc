package String;

public class StringManipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Student";
		//charAT will specified the index of a character
		
		//char --> return character at a specified index start with zero index
		
		
//		char charater=str.charAt(4);
//		System.out.println(charater);
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("-------------IndexOf---------------");
		
		
		//indexof() reurn an index of specified character
		
		
		String Str2="Sunday";
		int index=Str2.indexOf("n");
		System.out.println("index of n is " +index);
		
		String str3="syntax technology";
		System.out.println(str3.indexOf("syntax")); //0
		System.out.println(str3.indexOf("technology")); // 7
		System.out.println(str3.indexOf(" "));//6
		System.out.println(str3.indexOf("w"));//-1
		
		
		System.out.println("---------------SUB STRING");
		
		//subString() -->gives u another string from  your current string
		
		
		String str4="Today is sunday java class";
		String newString=str4.substring(8);
		System.out.println(newString);
		
		String news=str4.substring(0,4);
		System.out.println(news); //today
		System.out.println(str4.substring(9,20));//sunday java
		System.out.println(str4.substring(16,20));
	}

}
