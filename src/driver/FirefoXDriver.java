package driver;

public class FirefoXDriver implements Webdriver {

	@Override
	public void initializeBrowser() {
		System.out.println("Initializing the Firefox Browser.");
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

	public static void main(String[] args) {
		FirefoXDriver fx = new FirefoXDriver();
		fx.initializeBrowser();
		fx.setProperties();
		fx.maximiseWindow();
	}
}
