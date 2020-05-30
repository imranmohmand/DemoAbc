package ClassAndObject;

public class BuildMethodOrUserDefineMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build in method
		String str="hello";
		str=str.replace("hello","hi");
		System.out.println(str);
	
		
		
		BuildMethodOrUserDefineMethod meth=new BuildMethodOrUserDefineMethod();
		
		meth.MyOwnMethod();
		
		
	}
	// my method
	void MyOwnMethod() {
		System.out.println("this is the method i created by my own");
	}
}
