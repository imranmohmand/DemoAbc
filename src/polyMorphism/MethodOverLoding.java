package polyMorphism;

public class MethodOverLoding {
	
	// method overloading 
	//1 by passing different amount of parameter
	
	public void Add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void Add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
	// by different type of parameter
	public void Add(double num1,double num2) {
		System.out.println(num1	+num2);
	}
	public void Add(double num1,int num2) {
		System.out.println(num1+num2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoding obj=new MethodOverLoding();
		obj.Add(10, 20);
		obj.Add(10, 20, 10);
		
		obj.Add(10.2, 20.2);
		obj.Add(20.2, 22);
		

	}

}
