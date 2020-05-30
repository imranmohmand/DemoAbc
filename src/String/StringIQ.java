package String;

public class StringIQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str="Hello";
		//another ways
		String str=new String("hello");
		// find the number of character inside  the string
		int size=str.length();
		System.out.println(size);
		
		
		//case conversion methods/function
		System.out.println("-----------toLowerCase-------");
		String convetToLower=str.toLowerCase();
		System.out.println(convetToLower);
		
		//to uppercase
//		str =str.toLowerCase().toUpperCase();
//		System.out.println(str);
		
		System.out.println("-----------toUpperCase-------");
		String converToUpperCase=str.toUpperCase();
		
		System.out.println(converToUpperCase);

		
		System.out.println("-----------verify if the string is empty-------");
		String empty=""; // empty value we have
		boolean isempty=empty.isEmpty();
		System.out.println(isempty);
		
//		System.out.println("-----------null-------");
//		
//		String nul=null; // no value at all
//		boolean isNull=nul.isEmpty();
//		System.out.println(isNull);
		
		
		
//		how to verify existance character in a string
		 String existanceCharacter="Good Evening students";
		 
		 boolean exist=existanceCharacter.contains("Evening");
		 System.out.println(exist);
		 System.out.println(existanceCharacter.startsWith("Good"));
		 System.out.println(existanceCharacter.endsWith("student"));
		 
		 
		 String strin="syntax Technology";
		 char c=strin.charAt(5);
		 System.out.println(c);
		 
		 //length //17
		//System.out.println(strin.charAt(strin.length())); // java.lang.StringIndexOutOfBoundsException
		 System.out.println(strin.charAt(strin.length()-1));
		 
		 String replaceCh="khsu&******hhal1223*&^%^&";
		 String a=replaceCh.replaceAll("[^a-z0-9]","");
		 System.out.println(a);
		 
		 
		 //split
		 String sp="Java class at syntax are awsome";
		String[] s= sp.split("a");
		System.out.println(s);
		 
	}

}
