package driver;

public class ChromeDriver implements Webdriver {

	@Override
	public void initializeBrowser() {
		System.out.println("Initializing the Chrome Browser.");
		System.out.println("--------------------------------");
		
	}

	@Override
	public void setProperties() {
		System.out.println("Setting up the properties.");
		System.out.println("--------------------------------");
		
	}

	@Override
	public void maximiseWindow() {
		System.out.println("Maximizing the Window.");
		System.out.println("--------------------------------");
		
	}

	public static void main(String [] args) {
		ChromeDriver ch = new ChromeDriver();
		ch.initializeBrowser();
		ch.setProperties();
		ch.maximiseWindow();
	}
	
}
