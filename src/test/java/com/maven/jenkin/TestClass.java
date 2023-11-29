package com.maven.jenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


public class TestClass {

	
	public static WebDriver driver;
	
	@BeforeTest
	public void precondition1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html"); // to open URL
		
	}
	
	@Test
	public void test()
	{
		System.out.println("new test");
		org.openqa.selenium.WebElement addr =		driver.findElement(By.tagName("texta"));
		
		addr.click();
		addr.clear();
		addr.sendKeys("Perungudi");
			
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}
