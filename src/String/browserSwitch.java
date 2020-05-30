package String;

import java.util.Scanner;

public class browserSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*lets ask user to enter browser
		base on the input we say"your select browser is"
		*/
		
		Scanner scan;
		//String ChromeBrowser,FirefoxBrowser,InternetExplorerBrowser;
		System.out.println("please enter your browser");
		scan=new Scanner(System.in);
		
		String browser=scan.nextLine();
		switch(browser.toLowerCase()) {//toLowerCase() if you ignore case tht only way bez .euqalIgnoresCase will not worl on String in switch case
		case "firefox":
			System.out.println("execution will be perform on firefox"+browser);
			break;
		case "chrome":
			System.out.println("execution will be perform on chrome"+browser);
			break;
		case "ie":
			System.out.println("execution will be perform on ie"+browser);
			break;
		case "safari":
			System.out.println("execution will be perform on safari"+browser);
			break;
		default:
			System.out.println("please provides a valid browser");
		
		
		}
		
	}

}
