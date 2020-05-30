package abc;

public class trickeyFoorLoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*write down to find out the sum of even and odd number 
			from range 1 to 20
			Expecting 2 outputs sum for odd number=...
			sum for even number=...
			 
		 */

		
		
		int evensum=0;
		int oddsum=0;
		for(int i=1;i<=20;i++) {
			
			if(i%2==0) {
				evensum=evensum+i;
			}else
				oddsum=oddsum+i;
		}
		System.out.println("the sum of total of all even number is "+ evensum);
		System.out.println("the sum of total of all odd number is "+ oddsum);
		
		
	}

}
