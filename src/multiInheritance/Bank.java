package multiInheritance;

public class Bank {
	
	//inheritance this variable and method will not effect the 
	//original codes so simple inheritance and reuse
	
	// we are trying to implement our own behaviors 
	int money;
	
	public double chargeFee() {
		double fee;
		if(money<1000) {
			fee=money*0.1;
		
		}else {
			fee=0;
		}return fee;
	} 

}


class PNC extends Bank{
	//optional to verify that you are  actually overriding
	//@Override
	public double chargeFee() {
		double fee;
		if(money<1000) {
			fee=money*0.05;
		}else {
			fee=0;
		}return fee;
	}
	
}
