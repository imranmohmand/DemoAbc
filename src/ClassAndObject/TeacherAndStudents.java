package ClassAndObject;

public class TeacherAndStudents {
	
	
	int students,teachers,classrooms;
	String name,address,webiteString;
	
	
	void study() {
		System.out.println("students studying at "+ name);
		
	}
	void teach() {
		System.out.println("teachers teach at "+ name);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherAndStudents school1=new TeacherAndStudents();
		school1.name="Syntax";
		school1.students=200;
		
		TeacherAndStudents school2=new TeacherAndStudents();
		school2.name="karishna Training";
		school2.students=100;
		
		
		school1.study();
		school1.teach();
		
  
		
		
	
		
		
		
		
		
		

	}

}
