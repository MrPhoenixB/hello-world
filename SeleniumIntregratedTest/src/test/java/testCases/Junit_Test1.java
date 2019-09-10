package testCases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Junit_Test1{
	
	public static WebDriver driver=null;


	@Before
	public void setUp() throws Exception {
		
		WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
		driver=new ChromeDriver();
		
		
	}
		
	
	@Test
	public void demoTest() {
		
		driver.get("https://www.google.com");
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("Test Ended");
		
	}

}
