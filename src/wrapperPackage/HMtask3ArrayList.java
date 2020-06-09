package wrapperPackage;
/*
*create an arrayList of drinks.
if any drink has letter "a" or "e" replace it with water.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class HMtask3ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String>drink=new ArrayList<>();
		drink.add("cola");
		drink.add("milk");
		drink.add("Juice");
		drink.add("tea");
		drink.add("coffe");
		
		drink.set(0, "water");
		System.out.println(drink);
		
		for(int i=0;i<drink.size();i++) {
			if(drink.get(i).contains("a") || drink.get(i).contains("e")){
			drink.set(i, "water");
			}
		}System.out.println(drink);
			
		
	}

}
