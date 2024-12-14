package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		// TO launch the browser
		ChromeDriver driver = new ChromeDriver();
		
//Load the URL
		 	driver.get("https://leafground.com/alert.xhtml");
		 	
		 	
		 	//maximize the browser
		 	
		 	driver.manage().window().maximize();
		 	
		 	//Clicking the focus
		 	
		 	driver.findElement(By.xpath("//span[text()='Show']")).click();
		 	Thread.sleep(3000);
		 	
		 	Alert SimpleALert = driver.switchTo().alert();
		 	String SimpleALertText = SimpleALert.getText();
		 	System.out.println(SimpleALertText);
		 	SimpleALert.accept();
		 	
		 	


}
}