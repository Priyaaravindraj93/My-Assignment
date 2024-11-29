package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser1 
{
	public static void main(String[] args) {
		//Launch the browser
	ChromeDriver driver = new ChromeDriver();
	
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

	
	  //Click the CRMSFA link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
	//Click Leads link
			driver.findElement(By.linkText("Leads")).click();
			
			//Click create lead
			driver.findElement(By.linkText("Create Lead")).click();
			
			
			//driver.findElement(By.partialLinkText("Create")).click();
			

//Handling dropdown
//Step1: Finding the element
			
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("HP");

WebElement src1 = driver.findElement(By.id("createLeadForm_dataSourceId"));

//Instantiate the Select Class
  Select dd1=new Select(src1);
  
   dd1.selectByIndex(4);
 
   WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     Select marketdd2=new Select(market);
   marketdd2.selectByVisibleText("Automobile");
   
   WebElement ownershipdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
   Select dd3 = new Select(ownershipdropdown);
   dd3.selectByValue("OWN_CCORP");
   
   driver.findElement(By.name("submitButton")).click();
   
   
	}}
   
   
   

  
