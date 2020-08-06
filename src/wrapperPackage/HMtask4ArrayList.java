package wrapperPackage;

import java.util.ArrayList;
import java.util.Iterator;

/*
*create an arrayList of even numbers from 1 to 50.
*using iterator remove any number that is divisible by 5 from that arrayList.
*/


public class HMtask4ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				list.add(i);
			}else {
				System.out.println(list);
			}
			
			
		}
		
		
	}

}
