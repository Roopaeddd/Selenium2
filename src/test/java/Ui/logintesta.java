package Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintesta {
	
	
	public static WebDriver driver ;
	@Parameters({"browser"})
	
	@Test
	public void launchApplication(String browser){
	
	if(browser.equals("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
	
	}else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver  = new FirefoxDriver();
		
		}else if(browser.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				 driver  = new EdgeDriver();
			}
	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.close();
	}

}
