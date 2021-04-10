package demo_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;


public class testing2 
{
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
				
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the website
		driver.navigate().to("https://www.thesparksfoundationsingapore.org/");
		Thread.sleep(10000);
		
		//Maximizing the window size
		driver.manage().window().maximize();  
		Thread.sleep(5000);
		
		//Clicking on the link with a partial text of "GRIP"
		driver.findElement(By.partialLinkText("GRIP")).click();  
		Thread.sleep(5000);
        
        //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/nav/div[2]/nav/ul/li[6]/a"));
		
		//Clicking on About Us link		
        driver.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(6) > a")).click();
		
		//driver.findElement(By.className("col-md-6 navbar-brand")).click();
		
		Thread.sleep(10000);
        driver.close();
		
		
	
		
				  
		

	}

	

}
