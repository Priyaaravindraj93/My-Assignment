package week3.day2;

public class LaunchChromeBrowser extends BrowserLaunch {
	//To call the Super/Parent Class methods - super
	
	
	public void launchBrowser() {
		super.launchBrowser();
		System.out.println("Chrome Browser should be launched");

	}
	
	public static void main(String[] args) {
		LaunchChromeBrowser obj=new LaunchChromeBrowser();
	    obj.launchBrowser();
	    
	    
	}

}
