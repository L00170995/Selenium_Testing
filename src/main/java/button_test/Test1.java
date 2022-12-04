package button_test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test1 {
	WebDriver driver = null; 
	String driverpath;
	
	@BeforeTest
	
	public void SetUp() throws FileNotFoundException {
		
		driverpath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
	    driver = new ChromeDriver();
	    
		
	}
	
	@Test
    public void linktest()   {
		
	    
	    //URL launch
	    driver.get("http://the-internet.herokuapp.com");
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    //identify element
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    WebElement q= driver.findElement(By.linkText("A/B Testing"));
	    q.click();
	   
	    
	}
	
	@AfterTest
	//@After
    public void Close() {
		
		
		driver.close();
		
		driver.quit();
		
		System.out.println("Test Completed Successfully");
	}

}



