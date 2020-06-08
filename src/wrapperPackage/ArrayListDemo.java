package wrapperPackage;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//suppose you want to find out how many link available on the web-page
		//and regardless of duplicate links so you can used arrayList
		
		
		ArrayList<String>arraylist=new ArrayList<String>();// here i created an arrayList which store
															//string type
		//to store values inside your collection
		arraylist.add("aimal");
		arraylist.add("khushhal");
		arraylist.add("jabir");
		arraylist.add("john");
		
		// to retrieve value from the arrayList
		System.out.println(arraylist.get(2));
		
		//to add more values 
		arraylist.add("john");
		arraylist.add("Muhammad");
		arraylist.add("jane");
		
		//how many elements inside the arrayList
		int size=arraylist.size();
		System.out.println(size);
		
		//so if i want to store numeric value and i tried
		//ArrayList<int>arrayList=new ArrayList<>();// it will give me an error because i cannot store primitive data type
													// so i can convert primitive into object by using wrapper class like integer

		
		ArrayList<Integer>numArrayList=new ArrayList<>();
		numArrayList.add(100);
		numArrayList.add(200);
		numArrayList.add(300);
		
		//update vales
		numArrayList.set(0, 1000);
		System.out.println(numArrayList); // you will get all values in one line and in good format 
		
		//Retrieving values
		System.out.println(numArrayList.get(2));
		for(int num=0;num<numArrayList.size();num++) {
			System.out.println(numArrayList.get(num));
		}
		
		//another way by using enhance loops
	//  for(integer we used because in collection we convert primitive into object or non-primitive)
		//also int num=called control or counter variable
		for(Integer number:numArrayList) {
			System.out.println(number);
		}
		
		
	}

}
