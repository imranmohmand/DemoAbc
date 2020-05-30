package String;

import java.util.Arrays;

public class IQquestionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *write a java program to fine the second largest  number in the array
		maximum and minimum number in the array 

		 */
		
		// 1  easy way ,
		//when an interviews they asked you about max and min but no restriction 
		
		int[]array= {100,33,4,0,-90};
		Arrays.sort(array);
		int max=array[0];
		int min=array[array.length-1];
		System.out.println(max);
		System.out.println(min);
		
		// 2 way
		int[]Myarray= {105,33,4,0,-90,-95};
		int largest=Myarray[0];
		int smallest=Myarray[0];
		
		for(int i=0;i<Myarray.length;i++) {
			if(Myarray[i]<smallest) {
				smallest=Myarray[i];
				
			}if(Myarray[i]>largest) {
				largest=Myarray[i];
			}
		}
		System.out.println("the smaleest values is "+ smallest);
		System.out.println("the largest values is "+ largest);
		
		
		// second largest value
		
		System.out.println("************ incomplete task******************");
		
		int[]Marray= {105,33,4,0,-90,-95};
		int firstLargest=Marray[0];
		int secondLargest=Marray[0];
		
		for(int j=0;j<Marray.length;j++) {
			
			if(Marray[j]>firstLargest) {
				firstLargest=secondLargest;
				firstLargest=Marray[j];
				
			}
			if(Marray[j]>secondLargest) {
				secondLargest=Marray[j];
				
			}
		 }
		System.out.println("the first largest number is "+ firstLargest);
		System.out.println("the second largest number is "+ secondLargest);
	}

}
