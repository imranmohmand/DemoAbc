package thisKeyWord;

public class ThisKey {
	
	public int a,b;
	
	public ThisKey(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void sum(int a,int b) {
		System.out.println("the sum of  local variable is "+(a+b));
		System.out.println("the sum of the instance variable is "+(this.a+this.b));
		
	}
	
	//this methods
	 public void sayA() {
		 System.out.println(a);
	 }
	 public void sayB() {
		 System.out.println(b);
	 }
	 public void sayAandB() {
		 this.sayA();// this will refer to his instance method 
		 sayB();// the compiler add automatically--> this.sayB();
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKey obj=new ThisKey(10, 20);
		obj.sum(20, 30);
		
		//method
		obj.sayA();
		obj.sayB();
		System.out.println();
		obj.sayAandB();

	}

}
