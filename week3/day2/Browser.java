package week3.day2;

public class Browser {

	
	String browsername = "www.google.com";
	String browserversion;	
	public void openURL()
	{
		System.out.println("URL is opened");
	}
	public void LoadURL()
	{
		System.out.println(browsername +" "+"Loaded" );
	}
	
	public void navigateBack()
	{
		System.out.println("Navigated to "+ browsername);
	}
	
	
	public void closeBrowser()
	{
		System.out.println("The browser is closed");
	}
	public static void main(String[] args) {
		Browser brow1 =new Browser();
		
		
	brow1.openURL();
	brow1.LoadURL();
	brow1.navigateBack();
	brow1.closeBrowser();
	
		}

}
