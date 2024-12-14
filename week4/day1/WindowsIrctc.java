package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsIrctc {

	public static void main(String[] args) {
		
	// TO launch the browser
	ChromeDriver driver = new ChromeDriver();
	
//Load the URL
	 driver.get("https://www.irctc.co.in/");
//maximize the browser
	 driver.manage().window().maximize();
	 
	 
	 Alert PromptAlert=driver.switchTo().alert();
	 	 	PromptAlert.accept();
	 
	 //Implicitly Wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	 driver.findElement(By.xpath("//a[text()=' FLIGHTS ']"));
	
	 //step1:get handle
	  Set<String> newaddress=driver.getWindowHandles();
	 System.out.println("new Address is:"+newaddress); 
	 //step2:covert the set to list
	 List<String> allwindowAdd=new ArrayList<String>();
	 System.out.println("allwindowAdd");
	 //transfer the focus
	 driver.switchTo().window(allwindowAdd.get(1));
	 // verify the title
	 String Title1=driver.getTitle();
	 System.out.println("Title of the page is :"+" " + Title1 );
	 driver.switchTo().window(allwindowAdd.get(0));
	 driver.close();
	}
}
