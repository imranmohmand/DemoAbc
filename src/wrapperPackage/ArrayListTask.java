package wrapperPackage;

import java.util.ArrayList;

/*
 task
*create a generic ArayList that will store 5 names into it.
*Find out whether the given ArrayList is empty or not ?
*Check whether the specific name is present in an *ArrayList or not ?
find the size of your arrayList and print all values from that

 */

public class ArrayListTask {

	public static void main(String[] args) {
		// Generic-->can take only same data type
		ArrayList<String>strname=new ArrayList<>();
		strname.add("Aimal");
		strname.add("Nouman");
		strname.add("khan");
		strname.add("ali");
		strname.add("john");
		
		if(!(strname.isEmpty())){
			for(int i=0;i<strname.size();i++) {
				System.out.println(strname.get(i));
			}
			System.out.println("the specifice name at the index 2 is : "+strname.get(2));
		}
		int size=strname.size();
		System.out.println("the total size is : "+size);
		
		
		
		
		// ArrayList can be Generic and non Generic 
		
	  //non-Generic-->can hold any type of data
		ArrayList aList=new ArrayList();
		aList.add("johnsda");
		aList.add(100);
		aList.add(10.23);
		aList.add('a');
		System.out.println(aList);
		
		
		

	}

}
