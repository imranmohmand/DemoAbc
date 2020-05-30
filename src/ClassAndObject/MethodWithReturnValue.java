package ClassAndObject;

public class MethodWithReturnValue {
        public static void main(String[] args) {
		/*declare a string adn if string has more than 10 character 
		 * string is large otherwise -->string is small
		 */
		String  str="welcome home";
		int number=str.length();
		if(number>10) {
			System.out.println("the string is greater ");
		}else {
			System.out.println("the string is smaller  " );
		}
		char character=str.charAt(4);
		System.out.println(character);
		MethodWithReturnValue obj=new MethodWithReturnValue();
		int sum=obj.sum(10, 20);
		System.out.println(sum);
		
		int larger=obj.findLargest(40, 30);
		System.out.println(larger);
		
		}
         
        
        
	// return type,methodName
	int sum(int num1,int num2) {
		int c=num1+num2;
		return c;
		}
	//method to find largest number
	int findLargest(int a,int b) {
		int larger;
		if(a>b) {
			larger=a;
		}else {
			larger=b;
		}return larger;
	}
}
