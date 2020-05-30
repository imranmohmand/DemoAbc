package abc;

public class MutilDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2D dimension
		int[][] number=new int[4][4];
		
		// 1st row
		number[0][0]=12;
		number[0][1]=13;
		number[0][2]=14;
		number[0][3]=15;
		// 2Nd Row
		number[1][0]=1;
		number[1][1]=2;
		number[1][2]=3;
		number[1][3]=4;
		
		// 3rd Row
		number[2][0]=5;
		number[2][1]=10;
		number[2][2]=15;
		number[2][3]=20;
		
		//4th Row
		number[3][0]=100;
		number[3][1]=200;
		number[3][2]=300;
		number[3][3]=400;
		
		//System.out.println(number[1][2]);
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(number[i][j]);
				
			}
		}

	}

}
