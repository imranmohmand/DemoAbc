package abc;

public class ArrayTwoDimensonTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1.create a 2D array where you will store the following values:Jordan,Jackson,Obama.
		 * after storing values print the following: Mrs smith,Mr Obama,Ms Jackson.
		 */
          
		String[][]names= {
				{"Smith","Jordan","Jackson","Obama"},
				{"Mrs","Mr","MS"},
						};
		 
		
		
		
		System.out.println(names[1][0]+" "+ names[0][1]);
		System.out.println(names[1][1]+" "+ names[0][3]);
		System.out.println(names[1][2]+" "+ names[0][2]);
		
		// nested loop
		
		int rows=names.length; // this will gave me how many row i have
		int cols=names[0].length; // it will gave me column in 
		System.out.println(rows);
		System.out.println(cols);
		
		for(int row=0;row<names.length;row++ ) {
			for(int col=0;col<names[row].length;col++) {
				System.out.println(names[row][col]);
			}
		}
		
//		String[][]name=new String[2][4];
//		name[0][0]="smith";
//		name[0][1]="Jordan";
//		name[0][2]="Jackson";
//		name[0][3]="Obama";
//		
//		//2nd row
//		name[1][0]="Mrs";
//		name[1][1]="Mr";
//		name[1][2]="Ms";
//		
//		System.out.println(name[1][0]+" "+name[0][0]);
//		
		

//            Advance for loop
		System.out.println("------Advance Loop-----------");
		for(String [] a:names) {
			for(String namz:a) {
				System.out.print(namz +" ");
			}
			System.out.println();
		}
	

		
		
		}

}
