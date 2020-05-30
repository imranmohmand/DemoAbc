package String;

public class StringManipulation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//toArray()  -->convert string to array of character
		
		
		String str="staurday";
//       char[]array=str.toCharArray();
//       for(int i=0;i<array.length;i++) {
//    	   System.out.print(array[i]);
//       }
     char[] array=str.toCharArray();
     for(char c:array) {
    	 System.out.println(c);
    	 
    }
     
     
     
     System.out.println("Print in a reverse order");
     
     
     for(int i=array.length-1;i>0;i--) {
    	 System.out.println(array[i]);
     }
	}

}
