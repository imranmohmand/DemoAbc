package constructors;

public class Country {
	public String Capital,name;
	
	
	Country(){ // if you  create a non-parameterize constructor then compiler will not create a default constructor
		System.out.println("i am non argument constructor");
	}
	
	Country(String CountryName,String CountryCapital){
		name=CountryName;
		Capital=CountryCapital;
		
		
	}
	public void Display() {
		System.out.println(name+" "+Capital);
	}
	
	public static void main(String[] args) {
		
		// if you  create a non-parameterize constructor then compiler will not create a default constructor
		// if you would go this way without constructors
//		Country country1=new Country();
//		country1.name="USA";
//		country1.Capital="Washington DC";
//		
//		Country country2=new Country();
//		country1.name="Kazkistan";
//		country1.Capital="astana";
		
		// this would be happend when you have no method
//		System.out.println(country2.Capital);
//		System.out.println(country2.name);
		
		
	Country country2=new Country("USA", "Washington DC");
	Country country3=new Country("Kazakhistan", "Astana");
	Country country4=new Country("Pakistan", "Islamabad");
	
	Country country5=new Country();
	

	
	country2.Display();
	country3.Display();
	country4.Display();
	
	country5.Display();
	
	
		
		
	}
	
	

}
