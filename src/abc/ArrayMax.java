package abc;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an array of integer and find out max
		
		
		 int[]number= {2,44,55,754,9874};
		 int max=number[0];
		 for(int i=0;i<=number.length-1;i++) {
			 
			 if(number[i]>max) {
				 max=number[i];
				
				 
			 }
			 
		 }
		 System.out.println("the max number is "+ max);

	}

}
