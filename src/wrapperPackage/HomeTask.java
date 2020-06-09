package wrapperPackage;

import java.util.ArrayList;
import java.util.Iterator;

/*
create an arrayList of cats and retrieve all the values
*using 3 different ways
*/


public class HomeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>car=new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		
		
		// 1 way to do
		System.out.println("--------1st way to do(ForLoop)----------");
		for(int i=0;i<car.size();i++) {
			System.out.println(car.get(i));
			
			
			// 2 way to do
			System.out.println("--------2nd way to do(EnhanceLoop)----------");
			for(String str:car) {
				System.out.println(str);
			}
			
			// 3rd way to do
						System.out.println("--------3rd way to do(Iteration)----------");
						
/*
* iterator we have 3 method
haseNext();-->returns boolean if there is a next element in the collection
next();-->return that next element
remove();-->removes that next element
*/
						
			Iterator it=car.iterator();
			while(it.hasNext()) {
				System.err.println(it.next());
			}
			

			
		}
		

	}

}
