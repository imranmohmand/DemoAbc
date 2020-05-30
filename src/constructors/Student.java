package constructors;

public class Student {
	
	String name;
	int  Subject1,Subject2,Subject3;
	 
	
	 Student(String studentName,int sbj1,int sbj2, int sbj3) {
		 name=studentName;
		 Subject1=sbj1;
		 Subject2=sbj2;
		 Subject3=sbj3;
		
	}
	 public void CalculatorAverage() {
		int Average= (Subject1+Subject2+Subject3)/3;
		System.out.println("the student name is "+name+ "and average marks is "+Average);
	 }
	 
	 
	 
	public static void main(String[] args) {
		 Student objStudent1=new Student("Aimal", 99, 98, 100);
		 objStudent1.CalculatorAverage();
		 // 2 student
		 Student objStudent2=new Student("john", 90, 92, 80);
		 objStudent2.CalculatorAverage();
		 
		 Student objStudent3=new Student("doe", 99, 92, 88);
		 objStudent3.CalculatorAverage();
		 
		 Student objStudent4=new Student("kar", 99, 67, 70);
		 objStudent4.CalculatorAverage();
		 
		 Student objStudent5=new Student("wow", 99, 90, 100);
		 objStudent5.CalculatorAverage();

		
	}
	}


