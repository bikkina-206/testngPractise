package practise.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	 
	public static void main(String[] args) {
	 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	 
	// Open facebook
	driver.get("http://www.google.com");
	 
	// Maximize browser
	 
	driver.manage().window().maximize();
	 
	}
	 
	}
	

