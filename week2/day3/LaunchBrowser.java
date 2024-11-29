package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	
	public static void main(String[] args) {
		//Launch the browser
	ChromeDriver driver = new ChromeDriver(	);
	
	//Load the URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//Maximize the window
	driver.manage().window().maximize();

	//enter the username
	 //Finding the element -findElement
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	//enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//click login button
	driver.findElement(By.className("decorativeSubmit")).click();

}
}