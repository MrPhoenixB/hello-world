package SeleniumIntregratedTest.SeleniumIntregratedTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 * https://www.facebook.com
 */
public class App 
{
	public static WebDriver driver=null;


	@Before
	public void setUp() throws Exception {
		
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver=new ChromeDriver();
		
		
	}
		
	
	@Test
	public void demoTest() {
		
		driver.get("https://www.facebook.com");
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Test Ended");
		
	}
}
