package instructorKamla;

public class ClassMethodTask {
	
	public static void multi(int a,int b,int c) {
		int total=a*b*c;
		System.out.println(total);
		
	}
	public static void multi() {
		int a=2;
		int b=2;
		int c=2;
		int d=a*b*c;
		System.err.println(d);
	}
	public static int multiple(int a,int b,int c) {
		int result=a*b*c;
		System.out.println(result);
		return result;
	}
	public static int mult2() {
		int a=2;
		int b=2;
		int c=2;
		int d=a*b*c;
		System.out.println(d);
		return d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method s
		
		 multi(2, 2, 2);
		
		
		int result1=mult2();
		System.out.println(result1);
		multiple(2, 4, 3);
		mult2();

	}

}
