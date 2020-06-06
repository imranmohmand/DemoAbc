package task;

import superKeyWord.car;

/*
create a class car that would have the following fields:
*carPrice and color and method calculateSalePrice()
*which should be returning a price of the car.
create 2 sub classes:Sedan and Truck.
the Truck class has field as weight and has its own implementation of calculateSalePrice() method
in which returned  price calculated as following:
if weight>2000 then returned price car should include 10% discount,otherwise 20% discount.
the Sedan class has field as length and also does its own implementation of calculateSalePrice();
if length of Sedan is > 20 feet
then returned car price should include 5% discount,otherwise 10% discount
*/

 class Car {
 double carprice;
 String color;
 		 
 		public Car(double carprice,String color){
 			this.carprice=carprice;
 			this.color=color;
 	}

 public double calculateSalePrice() {
	 return carprice;
 }
 
}
class Sedan extends Car{
	int length;
	
	Sedan(double carprice,String color,int length){
		super(carprice, color);
		this.length=length;
	}
	public double calculateSalePrice() {
		if(length>20) {
			carprice=carprice-(carprice*0.05);//carprice=carprice*.95;
			
		}else {
			carprice=carprice-(carprice*0.1);
		}
		
		 return carprice;
	 }
	}
class Truck extends Car{
	double weight;
	Truck(double carprice,String color,double weight){
		super(carprice, color);
		this.weight=weight;
	}
	public double calculateSalePrice() {
		if(weight>2000) {
			carprice=carprice*0.90;//carprice=carprice-(carprice*.1);
		}else {
			carprice=carprice*0.80;
		}
		 return carprice;
	 }
}





