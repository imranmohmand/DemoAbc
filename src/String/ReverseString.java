package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// reverse a  string without a reverse function 
		
		System.out.println("-----------By using  toCharArray------------");
		
		String original="today is java class";
		
		char[] reverse=original.toCharArray();
		
		for(int i=reverse.length-1;i>0;i--) {
			System.out.print(reverse[i]);
		}System.out.println();
				System.out.println("-----------charAt-----------------");
				System.out.println();
				String reverse1="";
				for(int i=original.length()-1;i>=0;i--) {
					reverse1=reverse1+original.charAt(i);
					
				}
				System.out.println(reverse1);
	
				System.out.println();
				
				
				System.out.println("----------By SubString--------------");
				
				String reverse2="";
				for(int i=original.length()-1;i>0;i--) {
					reverse2=reverse2+original.substring(i-1,i);
					
				}
				System.out.print(reverse2);
				
	
	}

}
