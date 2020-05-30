package multiInheritance;



public class Employees {
	
	int salary;
	static String CompanyName;
	
	void work() {
		System.out.println("i work in " + CompanyName + " company");
	}
	void getPaid() {
		System.out.println("i get paid "+salary);
		
	}

}
