package abstrcution;
/*we have to calculate the percentage of marks obtained in  three subjects
(each out  of 100) by student A in four subject (each out of 100) by student,create class 'marks' with an abstract method '
getPercentage '.
it is inherited by classes 'A' and 'B" each having a method with the same same which returns the percentage of the  students.
the constructor of student A takes the marks in three subjects as its parameters
and the marks in four subject as its parameters for student B.
Test you code */

abstract class Marks{
	public abstract double getPercentage();
}
class StudentA extends Marks{
	double math;
	double urdu;
	double Economics;
	 StudentA(double math,double urdu,double Economics) {
		this.math=math;
		this.urdu=urdu;
		this.Economics=Economics;
	}
	 

	@Override
	public double getPercentage() {
		double average=(math+urdu+Economics)/3;
		
		return average;
	}
	
}class StudentB extends Marks{
	double math;
	double Englis;
	double Economics;
	double Statistics;
	StudentB(double math,double Englis,double Economics,double Statictics) {
		this.math=math;
		this.Englis=Englis;
		this.Economics=Economics;
		this.Statistics=Statictics;
		
	}
	

	@Override
	public double getPercentage() {
		double average=(math+Englis+Economics+Statistics)/4;
		return average;
	}
	
}

public class StudentTestTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA a=new StudentA(90, 80, 98);
		double average=a.getPercentage();
		System.out.println(average);
		
		StudentB b=new StudentB(90, 60, 90, 98);
		double average1=b.getPercentage();
		System.out.println(average1);

	}

}
