package thisKeyWord;

public class ThisWithInstanceLocalVariable {
	public String capital,name;
	public int population;
	
	
	 ThisWithInstanceLocalVariable(String name,String capital,int population) {
		 //if your local and instance variable has the same name than your compiler will get confuse that which variable is refer
		 // so for this keyword is used
		 //if your local and instance variable has different name than no need for this keyword
		 this.name=name;
		 this.capital=capital;
		 this.population=population;
		
	}
	 public void hello() {
		 System.out.println("the country name "+name+" and " +capital+ " and"+population);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisWithInstanceLocalVariable ob=new ThisWithInstanceLocalVariable("Pakistan", "Islamabad", 23224223);
		ob.hello();

	}

}
