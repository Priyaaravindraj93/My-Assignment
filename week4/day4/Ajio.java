package week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		 // Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.ajio.com/");
		
       //Maximize the Browser
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Findling Elements
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	   
	    driver.findElement(By.xpath("//span[text()='MEN']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='CATEGORIES']"));
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[text()='Bags & Wallets']")).click();
	    Thread.sleep(5000);
	    String items_count = driver.findElement(By.xpath("//div[@class='filter-container']//div/strong")).getText();
		System.out.println(items_count);
       
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@aria-label='brands']//following::div/ul/li//label"));
		int brand_size=elements.size();
		System.out.println("'/b'No of Brand:'/b'"+brand_size);
		System.out.println("Brands List are:");
		for(int i=0;i<brand_size;i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//label[@for='ADIDAS']")).click();
		Thread.sleep(5000);
		
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int bagname_size=bagname.size();
		System.out.println("Adidas bags quantity:"+bagname_size);
		System.out.println("Adidas bag names are:");
		for(int i=0;i<bagname_size;i++) {
			String text1 = bagname.get(i).getText();
			System.out.println(text1);
	
		}
	
	}
	

}
