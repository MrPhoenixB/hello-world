package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
 
 
public class TestNG_Test1 {
 
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
 
    //Declare a test URL variable
    public String testURL = "http://www.swtestacademy.com/";
 
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest (){
        //Create a new ChromeDriver
    	WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
 
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }
 
    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () {
        //Get page title
        String title = driver.getTitle();
 
        //Print page's title
        System.out.println("Page Title: " + title);
 
        //Assertion
        Assert.assertEquals(title, "Software Test Academy", "Title assertion is failed!");
    }
    
    @Test
    public void secondTest() {
    	Assert.assertFalse(true);
    }
 
    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        driver.quit();
    }
}

