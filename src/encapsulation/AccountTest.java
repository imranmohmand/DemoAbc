package encapsulation;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc=new Account();
		acc.setAccountNumber(123456789);
		long accountNum=acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(200);
		double myBlance=acc.getBalance();
		System.out.println(myBlance);
		
		
		//extra thing for understanding
		int num=123;
		String.valueOf(num);//convert integer into string to access the string method
		

	}

}
