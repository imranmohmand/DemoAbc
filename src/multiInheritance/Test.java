package multiInheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("creating an object of Employees ");
		Employees emp=new Employees();
		emp.salary=7000;
		emp.CompanyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("********");
		
		System.out.println("Create an object of ScrumTeam ");
		ScrumTeam sm=new ScrumTeam();
		sm.salary=9000;
		sm.work();
		sm.getPaid();
		sm.artifaceString="Product Backlog,Sprint BackLog,BurnDown Chart";
		sm.ceremonie="SprintDemo,Planning,Retro,DailyStandUp";
		
		System.out.println("********");
		
		System.out.println("creating an object of Developer");
		
		Developers dev=new Developers();
		dev.salary=13000;
		dev.work();
		dev.getPaid();
		dev.getPaid();
		dev.code();
		dev.ceremonie="Sprint Planning";
		dev.AttenScrumMeetings();

	}

}
