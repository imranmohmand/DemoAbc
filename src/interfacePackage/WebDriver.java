package interfacePackage;


interface TakeScreenShot{
	//public static final variable will be added by default
	String FILE_EXTENSION=".png";
	//same as Public static void string FILE_EXTENSION=".PNG";
	void takesScreen();
	
	// after JDK 1.8 the default and static method can added to interface
	static void takeSelfi() {
		System.out.println("i am define static method of TakeScreenShot interface");
	}
	default void TakePicture() {
		System.out.println("i am default defined method of Take screen shot interface");
	}
}
public interface WebDriver {
	
	//by default  compiler will add public abstract to the method
	public void openBrowser();
	public void maximizieWindow();
	public void findElement();
	public void CloserBrowser();


}

abstract class Browser{
	public abstract void refresh();
}

class FirefoxDriver extends Browser implements WebDriver,TakeScreenShot{

	@Override
	public void openBrowser() {
		System.out.println("the Firfox browser is open");
		
	}

	@Override
	public void maximizieWindow() {
		System.out.println("the window is maximized in Firfox browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("the CCS locator in Firefox ");
		
	}

	@Override
	public void CloserBrowser() {
		System.out.println("the Firfox is closed ");
		
	}

	@Override
	public void refresh() {
		System.out.println("refresh Firfox ");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("take screen shot in Firfox browser");
		
	}


}



class ChromeDriver extends Browser implements WebDriver,TakeScreenShot{

	@Override
	public void openBrowser() {
		System.out.println("the Chrome browser is open");
		
	}

	@Override
	public void maximizieWindow() {
		System.out.println("the window is maximized in chrome browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("the CCS locator in Chrome browser");
		
	}

	@Override
	public void CloserBrowser() {
		System.out.println("the chrome is closed ");
		
	}

	@Override
	public void refresh() {
		System.out.println("refresh Chrome ");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("take screen shot in Firfox browser");
		
	}


}




