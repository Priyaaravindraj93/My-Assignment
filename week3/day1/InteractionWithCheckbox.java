package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithCheckbox 

{
	public static void main(String[] args) {
		//Launch the browser
	ChromeDriver driver = new ChromeDriver();
	
	//Load the URL
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//Maximize the window
	driver.manage().window().maximize();

	//Adding implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	boolean selected = driver.findElement(By.xpath("//span[text()='Basic']")).isSelected();
	System.out.println(selected);
}
}