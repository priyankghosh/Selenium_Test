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
		/* Web Home Page Title verification*/
		 ////////////////////////////////////////////////////////////////////////////////////////
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		
		System.out.println("\nWeb tesing for home page title.....\n\n");
		Thread.sleep(7000);
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		String url = "https://www.thesparksfoundationsingapore.org/";
		driver.get(url);
		
		Thread.sleep(7000);
		//Maximizing window size
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "The Sparks Foundation | Home";
		
		System.out.println("\nActual Title : "+actualTitle);
		System.out.println("\nExpected Title : "+expectedTitle);
		Thread.sleep(2000);
		
		driver.close();
		
		Thread.sleep(2000);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("\nTittle is Verified");
			//Thread.sleep(7000);
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
		
		Thread.sleep(7000);
        
                
        ////////////////////////////////////////////////////////////////////////////////////////
		/* Web Home Page Url Verification */
        ///////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("\nWeb tesing for GRIP(Internship) page url .....\n\n");
        Thread.sleep(2000);
        
        WebDriver driver1 = new EdgeDriver();
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		driver1.navigate().to("https://www.thesparksfoundationsingapore.org/");
				
		Thread.sleep(7000);
		//Maximizing window size
		driver1.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Click on link 'About Us' using cssSelector
		driver1.findElement(By.partialLinkText("GRIP")).click(); 
		
		String actualP1Url = driver1.getCurrentUrl();
		String expectedP1Url = "https://www.thesparksfoundationsingapore.org/join-us/internship-positions/";
		
		System.out.println("\nActual Url : "+actualP1Url);
		System.out.println("\nExpected Url : "+expectedP1Url);
		Thread.sleep(2000);
		driver1.close();
		
		Thread.sleep(2000);
		if(actualP1Url.equals(expectedP1Url))
		{
			System.out.println("\nGRIP(Internship) page Url is verified");
			//Thread.sleep(7000);
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
						
		Thread.sleep(7000);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////
		/* Web Contact Us page Url Verification */
        ///////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("\nWeb tesing for page title on 'Contact Us' Page.....\n\n");
        Thread.sleep(7000);
        
        WebDriver driver2 = new EdgeDriver();
		driver2.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		driver2.navigate().to("https://www.thesparksfoundationsingapore.org/");
				
		Thread.sleep(7000);
		//Maximizing window size
		driver2.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Click on link 'About Us' using cssSelector
		driver2.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(6) > a")).click(); 
		
		String actualUrl = driver2.getCurrentUrl();
		String expectedUrl = "https://www.thesparksfoundationsingapore.org/contact-us/";
		
		System.out.println("\nActual Url : "+actualUrl);
		System.out.println("\nExpected Url : "+expectedUrl);
		Thread.sleep(2000);
		
		driver2.close();
		
		Thread.sleep(2000);
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("\nUrl is verified on the Contact Us Page");
			//Thread.sleep(7000);
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
						
		Thread.sleep(7000);
        
		

	}

}
