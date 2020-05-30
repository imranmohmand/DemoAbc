package ClassAndObject;

public class ObjectOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to create an object syntax is 
		//ClassName  variable=new ClassName();
		// like
		// Scanner scan=new Scanner(System.In);
		//like
		//String str=new String("Hello");
		
		
		// anything you want to execute should be under main method
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="s3";
		car1.color="Black";
		car1.year=2018;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
		//accessing behavior for 1 object
		car1.start();
		car1.accelerate();
		car1.drive();
		
		System.out.println("-------------- BMW-----------");
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="i8";
		car2.color="Black";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=4;
		car2.speed=200;
		
		
		// accessing behaviors  for 2 object
		car2.start();
		car2.accelerate();
		car2.drive();
		
		System.out.println("-------------------");
		
		// print  feature of the car
		// i have  black  tesla
		
		System.out.println("i have a "+car1.color+ car1.make);
		// i drive  bmw 2019
		System.out.println("i drive " + car2.make +" " +car2.year);
		

	}

}
