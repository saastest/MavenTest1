package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	  System.setProperty("webdriver.chrome.driver","chromedriverfdg.exe");

	   driver = new ChromeDriver();
	driver.get("https://www.GOOGLE.com/");
  }}