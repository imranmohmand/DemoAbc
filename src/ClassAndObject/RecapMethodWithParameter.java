package ClassAndObject;

public class RecapMethodWithParameter {
	
	void sum(int number1,int number2) {
		int c=number1+number2;
		System.out.println("the sum of 2 number = "+c);
	}
	
	//create a method to display hello 5 time
	// task 1
	 
	void sayHello(int time) {
		for(int i=0;i<time;i++) {
			System.out.println("hello");
		}
	}
	
	// create a method to say  something(anything but not hard coded) n number of time
	// task 2
	
	void saySomething(String word,int times) {
		for(int j=0;j<times;j++) {
			System.out.println(word);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RecapMethodWithParameter total=new RecapMethodWithParameter();
		
		//task 1
		total.sum(10, 20);
		total.sayHello(6);
		
		//task 2
		total.saySomething("bye", 5);
		total.saySomething("Aimal", 4);

	}

}
