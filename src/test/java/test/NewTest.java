package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");

	   driver = new ChromeDriver();
	driver.get("https://www.GOOGLE.com/");
	//Thread.sleep(5000);
	//String actualTitle = driver.getTitle();
	//driver.manage().window().maximize();
	//String expectedTitle = "Avinash Mishra Blogger: Learn Selenium WebDriver, Automation Framework, QA, SEO & Digital Marketing | Inviul Blog | Inviul";
	//Assert.assertEquals("Condition true", actualTitle, expectedTitle);
	
  }}