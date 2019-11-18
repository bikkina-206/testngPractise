package TestNG;
 
     import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	import org.openqa.selenium.*;
    import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;


 public class Launchlaunch {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "chromedriver.exe";
	 WebDriver driver ; 
	     
	  @BeforeMethod
	  public void launch() {
	       
	      System.out.println("launching chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      WebDriver driver=new ChromeDriver();  
	      driver.get(baseUrl);
	     
	  }
	  
 @Test
 public void verifyHomepageTitle() {
     String expectedTitle = "Welcome: Mercury Tours";
     String actualTitle = driver.getTitle();
     Assert.assertEquals(actualTitle, expectedTitle);
}
 
 @Test(priority = 0)
 public void register(){
     driver.findElement(By.linkText("REGISTER")).click() ;
     String  expected = "Register: Mercury Tours";
     String actual = driver.getTitle();
     Assert.assertEquals(actual, expected);
 }
     @Test(priority = 1)
 public void support() {
       driver.findElement(By.linkText("SUPPORT")).click() ;
      String expected = "Under Construction: Mercury Tours";
    String   actual = driver.getTitle();
       Assert.assertEquals(actual, expected);
     }
 
 @AfterMethod
 public void terminateBrowser(){
     driver.quit();
 }
}
	  
	  
	  
	  
	  
	  
	
	