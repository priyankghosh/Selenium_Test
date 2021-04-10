package demo_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testing1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
			
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("http://www.google.com/");
		//driver.manage().window().maximize();  
		
		driver.findElement(By.name("q")).sendKeys("Mad Bomber Case"+Keys.ENTER);  
            
		//driver.findElement(By.name("btnK")).click();  
		  
	}

}
