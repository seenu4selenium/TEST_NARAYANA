package com.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pqe.io/go-signup/");
		Thread.sleep(6000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
  }
}
