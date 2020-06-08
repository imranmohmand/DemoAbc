package wrapperPackage;

/*
 * implicitly mean the comiler will added automatically 


as we know that we can store multiple values in array and also we can stor primitive and non-primitave data like
primitive 
double[]
int[]
char[]
and so on
while non-primitive
String[]
object[]
monkey[]
fruit[]

but here are some limitation  of array
1)array is a fixed size structure(mean if tomorrow you want to increase the size you cannot )
2)we do not have methods to manipulate with data(add,remove,replace etc..)

so we overcome limitation with array here COLLECTION concept came in picture.

what is collection ?
collection is group of object represent as a single unit .
(since we know that the collection storing only group of object)
so to storing non-primitive type there is a concept called wrapper classes


wrapper classes:
is a class that convert primitive type into an object types.
the process of wrapping is called boxing(mean to put inside in box is called boxing)
and when you trying to take it out is called "un-boxing". 


why do we need ?
using wrapper classes we store converted primitive types 
inside our collections (number,characters,boolean)

  
 */


public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		//auto-boxing-->converting primitive type into an object type
		Integer integer=100;//so after converting you can access to all the available method in 
							// integer class
		System.out.println(integer.MIN_VALUE);//with only int num=10; you cannot get this method
		
		String string=integer.toString();
		System.out.println(string);
		//converting boolean primitive type into an object
		Boolean bolBoolean=true;
		
		
		//auto-unboxing-->converting object type into an primitive type
		
	int num1=new Integer(10);
	System.out.println(num1);
		
		
		

	}

}
