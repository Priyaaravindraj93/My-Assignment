package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableErail {

	public static void main(String[] args) {
		// TO launch the browser
					ChromeDriver driver = new ChromeDriver();
					
	   //Load the URL
					 driver.get("https://erail.in/");			 	
	 //maximize the browser
					 driver.manage().window().maximize();
					 
					 //Implicitly Wait
					 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//locating the webtable 
					 
		WebElement From= driver.findElement(By.id("txtStationFrom"));
		From.sendKeys("MAS",Keys.ENTER);
		
		
		WebElement To= driver.findElement(By.id("txtStationTo"));
		From.clear();
		To.sendKeys("MDU",Keys.ENTER);
		
		WebElement SortDate=driver.findElement(By.xpath(""));
					 
					 
	}}					 
					 