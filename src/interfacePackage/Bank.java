package interfacePackage;

public interface Bank {
	void havingChecking();
	void havingSaving();

}
interface Trustable{
	void trust();
}

class Financial{
	public void finance() {
		System.out.println("finanacil method ");
	}
}

class BOA extends Financial implements Bank,Trustable{

	@Override
	public void havingChecking() {
		System.out.println("BOA has a checking account");
		
	}

	@Override
	public void havingSaving() {
		System.out.println("BOA has a saving account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust BOA with your money");
		
	}
	
}
class CapitalOne  implements Bank,Trustable{

	@Override
	public void havingChecking() {
		System.out.println("Capital One has a checking account");
		
	}

	@Override
	public void havingSaving() {
		System.out.println("Capital One has a saving account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust Capital One with your money");
		
	}
	
}