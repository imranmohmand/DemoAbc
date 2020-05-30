package abc;

public class MutilDiemensionString {
	
	
	public static void main(String[] args) {
		
	
	
	String[][] groups= {
						{"Aimal","Khushhal"},
						{"Jabir","Humaima","Romaisa","Muhammad"},
						};
	
	
	//int row=groups.length;
	//int col=group[row].length    // becz each row has different columns
	//nested loop
	for(int row=0;row<groups.length;row++) {
		for(int col=0;col<groups[row].length;col++) {
			System.out.print(groups[row][col] +" ");
		}
		System.out.println();
	}
           System.out.println("****************************");
            System.out.println(groups[0][1]);
            System.out.println(groups[1][3]);
	
	}

}
