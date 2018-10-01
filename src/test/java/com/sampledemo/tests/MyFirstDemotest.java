package com.sampledemo.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyFirstDemotest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void Initialise() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\eclipse-workspace\\FaceBookDemo\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void openBrowserurl() {
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail1")).click();
		System.out.println("Gmail is clicked");
		
		
	}
	
	
	@Test
	public void MyDemoTest() {
		System.out.println("This is my DemoTest");
	}
	
	@Test
	public void MyCheckedCodeTest() {
		System.out.println("Sample This is My Checked Code test");
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	

}
