package com.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationalMethodsDemo {
  @Test
  public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		
		//Verify element is present on current screen?
		//Verify element is present enabled or disable state?
		//Clear the existing test data
		//type some info to editbox
		driver.findElement(By.name("email")).sendKeys("kahsfkasfk");
		
		driver.findElement(By.name("email")).click();
		
		
		
		
		
		
		
		//Refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Click on forward icon
		driver.navigate().forward();
  }
}
