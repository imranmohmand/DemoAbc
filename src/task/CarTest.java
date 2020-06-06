package task;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------Car------");
		Car car=new Car(2000, "black");
		System.out.println(car.calculateSalePrice());
		
		
		System.out.println("--------Sedan------");
		Sedan sedan=new Sedan(2000, "pink", 30);
		System.out.println(sedan.calculateSalePrice());
		
		
		System.out.println("--------Truck------");
		Truck truck=new Truck(2000, "yellow", 3000);
		System.out.println(truck.calculateSalePrice());

	}

}
