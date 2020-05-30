package abc;

public class ArrayTwoDimensionWithForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]grocerylist={{"banana","orange","apple"},
				{"onion","potato","cucumber"},
				{"yougurt","cheese","milk"},
				};
		
		for(String[] list:grocerylist) {
			for(String item:list) {
				System.out.print(item + " ");
			}System.out.println();
			
		}

	}

}
