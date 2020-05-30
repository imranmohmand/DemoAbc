package thisKeyWord;

public class ThisWIthConstructor {
	
	
	
	 ThisWIthConstructor() {
		 
		System.out.println("constructor without arguement");
	}
	 ThisWIthConstructor(String str){
		
		 System.out.println("this is with arguement "+str);
		 
	 }
	 ThisWIthConstructor(String str,String str2){
		 this(str);
		 //this() always must be a first statement
		 System.out.println("this is constructor wit two arguments");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisWIthConstructor obj=new ThisWIthConstructor("hello");
		System.out.println("-----------------------");
		
		//can we execute 2 constructor when creating an object
		//yes -it can be achieved using This();
		
		ThisWIthConstructor obj1=new ThisWIthConstructor("hello","Bye");
		

	}

}
