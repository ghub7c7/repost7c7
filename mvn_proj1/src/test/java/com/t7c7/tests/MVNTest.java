package com.t7c7.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MVNTest 
{
	public WebDriver driver;
	
	@Test
	public void launchBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
		driver.quit();
	}

}
