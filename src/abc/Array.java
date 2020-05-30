package abc;

public class Array {

	public static void main(String[] args) {
		
		/* create an array of countries.
		*while retrieving all value from an array capital for each country.
		*/
		
		
//		String []countries= {"USA","Afghanistan","India","Pakistan"};
//		
//		int size=countries.length;
//		
//		for(int i=0;i<=size-1;i++) {
//			
//			if(countries[i].equals("USA")) {
//				System.out.println("Washangton DC");
//			}else if(countries[i].equals("Afghanistan")) {
//				System.out.println("Kabul");
//			}else if(countries[i].equals("India")) {
//				System.out.println("Delhi");
//			}else if(countries[i].equals("Pakistan")) {
//				System.out.println("Islamabad");
//			}
//			
//			
//			
//		}
		
		
		
		
		String []countries= {"USA","Afghanistan","India","Pakistan"};
		
		for(String country:countries) {
			
			switch(country) {
			case "USA":
				System.out.println("Washangton DC");
				break;
			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "India":
				System.out.println("Dehli");
				break;
			case "Pakistan":
				System.out.println("Islamabad");
				break;
			}
		}
		
		

	}

}
