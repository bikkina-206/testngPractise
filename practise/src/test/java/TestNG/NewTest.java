package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest {
	

		
		public String baseURL = "https://www.google.com/";
		String driverpath = "chromedriver.exe";
		public WebDriver driver;
		
	  @Test
	  public void verifyHomepageTitle() {
		  
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(baseURL);
		  String expectedtitle = "Google";
		  String Actualtitle = driver.getTitle();
		  Assert.assertEquals(expectedtitle, Actualtitle);
		  driver.close();  
		  
	  }
	}