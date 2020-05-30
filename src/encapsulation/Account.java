package encapsulation;

public class Account {
	//data hiding from other class 
	//in encapsulation we hiding data for security purposes
	//you do not giving access to anyone direct to private variable
	//will be access only throw getter and setter 
	private long accountNumber;
	private double balnace;
	
	
	//getter -->give read only access 
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balnace;
	}
	//setter -->give write access
	public void setBalance(int amount) {
		if(amount>0) {
		balnace=balnace+amount;
		}
	}
	public void setAccountNumber(long accountNumber) {
		//if account number is greater than 9 digit than show the account number 
		
		if(String.valueOf(accountNumber).length()==9) {
		this.accountNumber=accountNumber;
		}
	}
	
}
