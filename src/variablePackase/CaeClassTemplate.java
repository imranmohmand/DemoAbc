package variablePackase;

public class CaeClassTemplate {
	/*
	 * we want to build make as Toyota
	 * that will have different models and color
	 */
	
	static String make;
	public String model;
	public String color;
	public int speed;
	public int windows;
	
	public void getDetails() {
		System.out.println("i bulid "+color+" "+make+" "+ model);
		System.out.println("My car has  "+windows+" door and can speed "+speed);
	}

}
