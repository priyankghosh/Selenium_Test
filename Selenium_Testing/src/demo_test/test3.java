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
		
		System.out.print("\n**********************************************************************************************************");
		System.out.print("\nConducting Check 1 : Web testing for Home Page title.....");
		System.out.print("\n**********************************************************************************************************\n\n");
		
		Thread.sleep(7000);
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		String url = "https://www.thesparksfoundationsingapore.org/";
		driver.get(url);
		
		Thread.sleep(5000);
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
			System.out.println("\nTitle is Verified");
			//Thread.sleep(7000);
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
		
		Thread.sleep(7000);
        
        
		 ////////////////////////////////////////////////////////////////////////////////////////
		/* Home page icon verification*/
		 ////////////////////////////////////////////////////////////////////////////////////////
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		
		System.out.print("\n**********************************************************************************************************");
		System.out.print("\nConducting Check 2 : Web testing for Home Page Company Logo........");
		System.out.print("\n***********************************************************************************************************\n\n");
		Thread.sleep(7000);
		
		WebDriver driver3 = new EdgeDriver();
		driver3.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver3.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the home page of site
		driver3.navigate().to("https://www.thesparksfoundationsingapore.org/");
		Thread.sleep(5000);
		
		//Maximizing window size
		driver3.manage().window().maximize();  
		driver3.manage().deleteAllCookies();
		
		//Navigating to Contact us page
		WebElement HomeImg = driver3.findElement(By.cssSelector("#home > div > div.top-header-agile > h1 > a > img"));
						
		Thread.sleep(4000);
				
		if(HomeImg.isEnabled())
		{
			System.out.print("\nHome Page Icon is Enabled ");
			System.out.print("\nImage is clicked");
			System.out.print("\nVerified !!!\n\n");
			
			HomeImg.click();
			
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
		
		
		driver3.close();
		Thread.sleep(7000);
		
        ////////////////////////////////////////////////////////////////////////////////////////
		/* GRIP(Internship) page Url Verification */
        ///////////////////////////////////////////////////////////////////////////////////////
        
		System.out.print("\n**********************************************************************************************************");
        System.out.print("\nConducting Check 3 : Web testing for GRIP(Internship) page url ........");
        System.out.print("\n**********************************************************************************************************\n\n");
        Thread.sleep(7000);
        
        WebDriver driver1 = new EdgeDriver();
		driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the site
		driver1.navigate().to("https://www.thesparksfoundationsingapore.org/");		
		Thread.sleep(5000);
		
		//Maximizing window size
		driver1.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		
		//Click on link 'About Us' using cssSelector
		driver1.findElement(By.partialLinkText("GRIP")).click(); 
		
		String actualHUrl = driver1.getCurrentUrl();
		String expectedHUrl = "https://www.thesparksfoundationsingapore.org/join-us/internship-positions/";
		
		System.out.println("\nActual Url : "+actualHUrl);
		System.out.println("\nExpected Url : "+expectedHUrl);
		Thread.sleep(2000);
		
		driver1.close();
		
		Thread.sleep(3000);
		if(actualHUrl.equals(expectedHUrl))
		{
			System.out.println("\nGRIP(Internship) page Url is verified");
			
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
						
		Thread.sleep(7000);
        
        ////////////////////////////////////////////////////////////////////////////////////////
		/* Web 'Contact Us' page Url Verification */
		///////////////////////////////////////////////////////////////////////////////////////
				
		System.out.print("\n**********************************************************************************************************");		
		System.out.print("\nConducting Check 4 : Web testing for page url on 'Contact Us' Page.......");
		System.out.print("\n**********************************************************************************************************\n\n");
		Thread.sleep(7000);

		WebDriver driver2 = new EdgeDriver();
		driver2.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Navigating to the site
		driver2.navigate().to("https://www.thesparksfoundationsingapore.org/");				
		Thread.sleep(5000);

		//Maximizing window size
		driver2.manage().window().maximize();
		//driver.manage().deleteAllCookies();

		//Click on link 'About Us' using cssSelector
		driver2.findElement(By.partialLinkText("Contact")).click(); 

		String actualCUUrl = driver2.getCurrentUrl();
		String expectedCUUrl = "https://www.thesparksfoundationsingapore.org/contact-us/";

		System.out.println("\nActual Url : "+actualCUUrl);
		System.out.println("\nExpected Url : "+expectedCUUrl);
		Thread.sleep(2000);

		driver2.close();

		Thread.sleep(2000);
		if(actualCUUrl.equals(expectedCUUrl))
		{
			System.out.println("\nUrl is verified on the 'Contact Us' Page\n");
				
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
				
		Thread.sleep(7000);
		
		System.out.print("\n**********************************************************************************************************");
		System.out.print("\nConducting Check 5 : Clicking on dropdown 'About Us' and checking if it is enabled or not ........");
		System.out.print("\n***********************************************************************************************************\n\n");
		Thread.sleep(7000);
		
		WebDriver driver4 = new EdgeDriver();
		driver4.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver4.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the home page of site
		driver4.navigate().to("https://www.thesparksfoundationsingapore.org/");
		Thread.sleep(5000);
		
		//Maximizing window size
		driver4.manage().window().maximize();  
		driver4.manage().deleteAllCookies();
		
		//Navigating to Contact us page
		WebElement AUDropdown = driver4.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(1) > a"));
						
		Thread.sleep(2000);
				
		if(AUDropdown.isDisplayed())
		{
			AUDropdown.click();
			Thread.sleep(2000);
			System.out.print("\nAbout Us dropdown is displayed and enabled");
			driver4.close();
			System.out.println("\nVerification done by clicking!!!\n");
								
		}
		else
		{
			System.out.print("\nAbout Us dropdown is not displayed");
			System.out.println("\nVerification failed !!!");
		}
		
		Thread.sleep(7000);
		
		
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
				
		Thread.sleep(7000);
		
		 ////////////////////////////////////////////////////////////////////////////////////////
		/*  About Us Dropdown and selecting executive team Verification*/
		 ////////////////////////////////////////////////////////////////////////////////////////
		
		System.setProperty("webdriver.edge.driver", "C:\\selenium\\msedgedriver.exe");
		
		System.out.print("\n**************************************************************************************************************");
		System.out.print("\nConducting Check 7 : Clicking on dropdown 'Programs' and going for option 'Workshops' ....");
		System.out.print("\n**************************************************************************************************************\n\n");
		Thread.sleep(7000);
		
		WebDriver driver6 = new EdgeDriver();
		driver6.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver6.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Navigating to the home page of site
		driver6.navigate().to("https://www.thesparksfoundationsingapore.org/");
		Thread.sleep(5000);
		
		//Maximizing window size
		driver6.manage().window().maximize();  
		driver6.manage().deleteAllCookies();
		
		//Navigating to Contact us page
		WebElement AUDropdown2 = driver6.findElement(By.cssSelector("#link-effect-3 > ul > li:nth-child(3) > a"));
						
		Thread.sleep(2000);
				
		if(AUDropdown2.isEnabled())
		{
			AUDropdown2.click();
			Thread.sleep(2000);
			//Select AU_dropdown = new Select(AUDropdown);
			driver6.navigate().to("https://www.thesparksfoundationsingapore.org/programs/workshops/");
			Thread.sleep(4000);
			//AU_dropdown.selectByVisibleText("Executive Team");
			//AU_dropdown.selectByValue("Executive Team");
			driver6.close();
			Thread.sleep(3000);
			System.out.println("\nVerification done for this page !!!");
		}
		else
		{
			System.out.println("\nVerification failed !!!");
		}
				
		Thread.sleep(7000);
		
		
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
