package String;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome Syntax student batch 4";
		String[] array=str.split(" "); //String[] array=str.split("S");//String[] array=str.split("a");
		System.out.println(array.length);
		
		//for each loop
		for(String splite:array) {
			System.out.println(splite);
		}
		
		
		//for loop
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
