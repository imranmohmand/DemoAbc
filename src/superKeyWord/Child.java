package superKeyWord;

public class Child extends Parent {
	String name="adam";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child objChild=new Child();
		objChild.callingName();
		

	}
	public void callingName() {
		System.out.println(name);
		System.out.println(super.name);//if you same variable name in the parent and child class so called parent variable 
										//with the help of superKeyword
		
		System.out.println(lastName);//if different just called it inheritance will call it direct 
	}
	
	public void callingMethod() {
		callingMethod();//by default this is added-so we are calling current class method
		super.callingName();
	}

}
