package com.picninc.testcases;

/**
* 
*/

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import Pages.LoginPage;

 
/**
* @author Mukesh_50
*
*/
public class VerifyWordPressLogin 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
 
System.setProperty("webdriver.gecko.driver","C:\\Users\\jayasm\\eclipse-workspace-WeekoneProject\\SeleniumProject1\\Drivers\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/");
 
LoginPage login=new LoginPage(driver);
 
Thread.sleep(3000);
login.loginToWordpress("Admin","admin123");
Thread.sleep(5000);
//login.typePassword("admin123");
//Thread.sleep(3000);
//login.clickOnLoginButton();
//Thread.sleep(3000);
 
 
driver.quit();
 
}
 
}
 
 
