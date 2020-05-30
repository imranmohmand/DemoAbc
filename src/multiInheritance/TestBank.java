package multiInheritance;

public class TestBank extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new Bank();
		bank.money=900;
		double fee=bank.chargeFee();
		System.out.println("the bank fee is "+ fee);
		
		
		// now create an object of PNC bank
		PNC pncBankPnc=new PNC();
		pncBankPnc.money=900;
		double PNCfee=pncBankPnc.chargeFee();
		System.out.println(PNCfee);

	}

}
