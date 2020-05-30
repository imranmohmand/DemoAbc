package interfacePackage;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.openBrowser();
		driver.maximizieWindow();
		driver.findElement();
		driver.CloserBrowser();
		
		
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		
		ChromeDriver driver1=new ChromeDriver();// or you can just change in lane 6 FirefoxDriver to ChromeDriver rather than code 
												//from lane 16 to 22
		driver1.openBrowser();
		driver1.maximizieWindow();
		driver1.findElement();
		driver1.CloserBrowser();
	
		

	}

}
