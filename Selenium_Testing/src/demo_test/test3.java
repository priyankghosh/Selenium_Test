package demo_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class test3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		 ////////////////////////////////////////////////////////////////////////////////////////
		/* Web Page Title verification*/
		 ////////////////////////////////////////////////////////////////////////////////////////
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		
		System.out.println("\nWeb tesing for page title.....\n\n");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		String url = "https://www.thesparksfoundationsingapore.org/";
		driver.get(url);
		
		Thread.sleep(7000);
		//Maximizing window size
		driver.manage().window().maximize();  
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "The Sparks Foundation | Home";
		
		System.out.println("\nActual Title : "+actualTitle);
		System.out.println("\nExpected Title : "+expectedTitle);
				
		if(actualTitle.equals(expectedTitle))
		{
			//System.out.println("\nThe Title of the page is : "+actualTitle);
			System.out.println("\nTittle is Verified");
		}
		else
		{
			//System.out.println("\nThe Title of the page is : "+actualTitle);
			System.out.println("\nVerification failed !!!");
		}
		
		Thread.sleep(7000);
        driver.close();
        
        ////////////////////////////////////////////////////////////////////////////////////////
		/* Web Url Verification */
        ///////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("\nWeb tesing for page title.....\n\n");
        
        
        WebDriver driver1 = new EdgeDriver();
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		driver1.navigate().to("https://www.thesparksfoundationsingapore.org/");
				
		Thread.sleep(7000);
		//Maximizing window size
		driver1.manage().window().maximize();
		
		//Click on link 'About Us' using cssSelector
		driver1.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(6) > a")).click(); 
		
		String actualUrl = driver1.getCurrentUrl();
		String expectedUrl = "https://www.thesparksfoundationsingapore.org/contact-us/";
		
		System.out.println("\nActual Url : "+actualUrl);
		System.out.println("\nExpected Url : "+expectedUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			//System.out.println("\n\nThe Url of the page is : "+actualUrl);
			System.out.println("\nUrl is verified");
		}
		else
		{
			//System.out.println("\nThe Url of the page is : "+actualUrl);
			System.out.println("\nVerification failed !!!");
		}
						
		Thread.sleep(7000);
        driver1.close();
		

	}

}
