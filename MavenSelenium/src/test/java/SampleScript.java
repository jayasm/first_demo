import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleScript {
	
	
		ExtentSparkReporter reporter;
		ExtentReports extent;

		@BeforeSuite
		public void setUp() {
			reporter = new ExtentSparkReporter("myreport.html");
			extent = new ExtentReports();
			extent.attachReporter(reporter);
		}
	
		@Test
		public void TestMethod()
		{
			
			ExtentTest test = extent.createTest("My first test");
			test.log(Status.INFO, "This shows info");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\jayasm\\eclipse-workspace-SeleniumTraining\\SeleniumSamples\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
			//Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.manage().window().fullscreen();
			/*WebElement obj1=driver.findElement(By.className("gb_f"));
			obj1.click();*/
			WebElement searchSample=driver.findElement(By.name("q"));
			searchSample.sendKeys("maveric systems");
			searchSample.sendKeys(Keys.ENTER);
			
			driver.quit();
			
			}
		@Test
		public void TestMethod2()
		{
			
			ExtentTest test = extent.createTest("My Second test");
			test.log(Status.INFO, "This shows info");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\jayasm\\eclipse-workspace-SeleniumTraining\\SeleniumSamples\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
			//Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.manage().window().fullscreen();
			/*WebElement obj1=driver.findElement(By.className("gb_f"));
			obj1.click();*/
			WebElement searchSample=driver.findElement(By.name("q"));
			searchSample.sendKeys("maveric systems");
			searchSample.sendKeys(Keys.ENTER);
			
			driver.quit();
			
			}
		
		@AfterSuite
		public void tearDown() {
		extent.flush();
		}
}
