
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class test4 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		 ////////////////////////////////////////////////////////////////////////////////////////
		/*  About Us Dropdown and selecting executive team Verification*/
		 ////////////////////////////////////////////////////////////////////////////////////////
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		
		System.out.print("\n**************************************************************************************************************");
		System.out.print("\nConducting Check 6 : Clicking on dropdown 'About Us' and checking for particular option 'Executive Team' ....");
		System.out.print("\n**************************************************************************************************************\n\n");
		Thread.sleep(7000);
		
		WebDriver driver5 = new EdgeDriver();
		driver5.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver5.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the home page of site
		driver5.navigate().to("https://www.thesparksfoundationsingapore.org/");
		Thread.sleep(5000);
		
		//Maximizing window size
		driver5.manage().window().maximize();  
		driver5.manage().deleteAllCookies();
		
		//Navigating to Contact us page
		WebElement AUDropdown1 = driver5.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(1) > a"));
						
		Thread.sleep(2000);
				
		if(AUDropdown1.isEnabled())
		{
			AUDropdown1.click();
			//Select AU_dropdown = new Select(AUDropdown);
			driver5.navigate().to("https://www.thesparksfoundationsingapore.org/about/executive-team/");
			Thread.sleep(2000);
			//AU_dropdown.selectByVisibleText("Executive Team");
			//AU_dropdown.selectByValue("Executive Team");
			driver5.close();
			Thread.sleep(3000);
			System.out.println("\nVerification done !!!");
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
				
		Thread.sleep(5000);
		
                
        
        
       		

	}

}
