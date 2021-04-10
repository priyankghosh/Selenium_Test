
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

public class test4 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		
////////////////////////////////////////////////////////////////////////////////////////
/*  Programs Dropdown and selecting Workshops and then Glimpses of Kids Verification*/
////////////////////////////////////////////////////////////////////////////////////////

System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");

System.out.print("\n**************************************************************************************************************");
System.out.print("\nConducting Check 8 : Clicking on dropdown 'Programs' and going for option 'Workshops' and then selecting\n");
System.out.print("option 'Glimpses of Kids' ....");
System.out.print("\n**************************************************************************************************************\n\n");
Thread.sleep(7000);

WebDriver driver7 = new EdgeDriver();
driver7.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver7.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Navigating to the home page of site
driver7.navigate().to("https://www.thesparksfoundationsingapore.org/");
Thread.sleep(5000);

//Maximizing window size
driver7.manage().window().maximize();  
driver7.manage().deleteAllCookies();

//Navigating to Contact us page
WebElement AUDropdown3 = driver7.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(3) > a"));

Thread.sleep(4000);

if(AUDropdown3.isEnabled())
{
AUDropdown3.click();
Thread.sleep(2000);

driver7.navigate().to("https://www.thesparksfoundationsingapore.org/programs/workshops/");
Thread.sleep(4000);

WebElement GK = driver7.findElement(By.cssSelector("body > div.w3l_inner_section.about-w3layouts > div > div.inner_w3l_agile_grids > div > div.single-middle > div > div > div > div:nth-child(1) > div > h4 > a"));
Thread.sleep(2000);
GK.click();

Thread.sleep(3000);
System.out.println("\nVerification done for this link in the page !!!");
Thread.sleep(3000);
driver7.quit();
}
else
{
System.out.println("\nVerification failed !!!");
}

Thread.sleep(7000);

////////////////////////////////////////////////////////////////////////////////////////
/*  'Links' Dropdown and selecting 'Software and App' and then Going for 'Salient features Verification'*/
////////////////////////////////////////////////////////////////////////////////////////

System.out.print("\n**************************************************************************************************************");
System.out.print("\nConducting Check 9 : Clicking on dropdown 'LINKS' and going for option 'Software & App' and then selecting\n");
System.out.print("option 'Salient Features' from the right side menu ....");
System.out.print("\n**************************************************************************************************************\n\n");
Thread.sleep(7000);

WebDriver driver9 = new EdgeDriver();
driver9.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver9.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Navigating to the home page of site
driver9.navigate().to("https://www.thesparksfoundationsingapore.org/");
Thread.sleep(5000);

//Maximizing window size
driver9.manage().window().maximize();  
driver9.manage().deleteAllCookies();

//Navigating to Contact us page
WebElement AUDropdown4 = driver9.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(4) > a"));

Thread.sleep(4000);

if(AUDropdown4.isEnabled())
{
AUDropdown4.click();
Thread.sleep(2000);

driver9.navigate().to("https://www.thesparksfoundationsingapore.org/links/software-and-app/");
Thread.sleep(4000);

WebElement GK = driver9.findElement(By.cssSelector("body > div.w3l_inner_section.about-w3layouts > div > div.col-md-3.agile-blog-sidebar > div > ul > li:nth-child(3) > a"));
Thread.sleep(4000);
GK.click();

Thread.sleep(3000);
System.out.println("\nVerification done for this button in the page !!!");
Thread.sleep(3000);
driver9.close();
}
else
{
System.out.println("\nVerification failed !!!");
}

Thread.sleep(7000);

////////////////////////////////////////////////////////////////////////////////////////
/*  Links Dropdown and selecting Software and App and then Going for Salient features Verification
Going back and clicking on 'Visit LINKS@TSF'*/
////////////////////////////////////////////////////////////////////////////////////////

System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");

System.out.print("\n**************************************************************************************************************");
System.out.print("\nConducting Check 10 : Clicking on dropdown 'LINKS' and going for option 'Software & App' and then selecting\n");
System.out.print("option 'Salient Features' from the right side menu going back and then clicking 'Visit LINKS@TSF' ....");
System.out.print("\n**************************************************************************************************************\n\n");
Thread.sleep(7000);

WebDriver driver8 = new EdgeDriver();
driver8.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver8.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//Navigating to the home page of site
driver8.navigate().to("https://www.thesparksfoundationsingapore.org/");
Thread.sleep(5000);

//Maximizing window size
driver8.manage().window().maximize();  
driver8.manage().deleteAllCookies();

//Navigating to Contact us page
WebElement AUDropdown5 = driver8.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(4) > a"));

Thread.sleep(4000);

if(AUDropdown5.isEnabled())
{
AUDropdown5.click();
Thread.sleep(1000);

driver8.navigate().to("https://www.thesparksfoundationsingapore.org/links/software-and-app/");
Thread.sleep(4000);

WebElement GK3 = driver8.findElement(By.cssSelector("body > div.w3l_inner_section.about-w3layouts > div > div.col-md-3.agile-blog-sidebar > div > ul > li:nth-child(3) > a"));
Thread.sleep(4000);
GK3.click();

Thread.sleep(3000);
System.out.println("\nVerification done for these pages !!!");
Thread.sleep(3000);

driver8.navigate().back();

WebElement GK4 = driver8.findElement(By.cssSelector("body > div.w3l_inner_section.about-w3layouts > div > div.col-md-3.agile-blog-sidebar > div > ul > li:nth-child(1) > a"));
Thread.sleep(4000);
GK4.click();

Thread.sleep(4000);			
driver8.quit();
}
else
{
System.out.println("\nVerification failed !!!");
}

Thread.sleep(7000);
		


		
                
        
        
       		

	}

}
