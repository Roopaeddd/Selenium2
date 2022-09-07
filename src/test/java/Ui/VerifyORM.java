package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyORM {
	@Test
	
	public void Titleorm()
	{
		
        SoftAssert softassert = new SoftAssert();
		String expectedtitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" ;
		String expectedtext = "searchghhhh";
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualtitle = driver .getTitle();
		System.out.println("verifying text");
		softassert.assertEquals(actualtitle, expectedtitle,"Title verifiction faild"); 
		String actualtext = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).getAttribute("value"); 
		System.out.println("verifying text");
	   softassert.assertEquals(actualtext, expectedtext,"Text verifiction failed");
	   System.out.println("closing browser");
		driver.close();
		
	}
	
      



	}


