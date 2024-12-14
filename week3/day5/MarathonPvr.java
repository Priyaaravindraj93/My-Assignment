package week3.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MarathonPvr {

	
	public static void main(String[] args) {
		// TO launch the browser
					ChromeDriver driver = new ChromeDriver();
					
	   //Load the URL
					 driver.get("https://www.pvrcinemas.com/");			 	
	 //maximize the browser
					 driver.manage().window().maximize();
	
					//Handling dropdown
					//Step1: Finding the element
					 
	WebElement src1 = driver.findElement(By.className("cities-show"));
	
	
	//Instantiate the Select Class
	  Select dd1=new Select(src1);
	  
	   dd1.selectByIndex(5);
	 
	   WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	     Select marketdd2=new Select(market);
	   marketdd2.selectByVisibleText("Automobile");
					 	

}
}