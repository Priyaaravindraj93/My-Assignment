package week3.day2;

public class Chrome extends Browser{
	
	public void openIncognito()
	{ System.out.println("Chrome opened in InCognito");
	}
	
	
	public void clearCache()
	{ System.out.println("Cache cleared");
	}
	

	public static void main(String[] args) {

Chrome chromeobj = new Chrome();
chromeobj.openIncognito();
chromeobj.clearCache();
chromeobj.openURL();
chromeobj.LoadURL();
chromeobj.closeBrowser();


	}

}
