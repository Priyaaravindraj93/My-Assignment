package week2.day1;

public class Browser
{
public String launchBrowser(String browserName)
{
	System.out.println("Browser Launched Successfully");
	return browserName;
}

public void loadUrl()
{
	System.out.println("Application url loaded successfully");

} 

public static void main(String[] args) 
{
 Browser obj1=new Browser();
  obj1.loadUrl();
  obj1.launchBrowser("Chrome");
	}
}

