import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int price;
		System.out.println("please pay for the coffe");
		price=scan.nextInt();
		while(price !=5) {
			System.out.println("please pay for coffe");
			price=scan.nextInt();
			
		}System.out.println("enjoy your coffe");
		

	}

}
