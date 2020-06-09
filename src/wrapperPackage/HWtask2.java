package wrapperPackage;

import java.util.ArrayList;
import java.util.Iterator;

/*
task 
*create an arrayList of words
*Remove every word that ends with "e".user iterator
*/

public class HWtask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list=new ArrayList<>();
		list.add("love");
		list.add("cute");
		list.add("java");
		list.add("hello");
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(list);

	}

}
