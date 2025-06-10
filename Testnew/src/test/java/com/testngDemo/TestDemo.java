package com.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDemo {
	WebDriver driver;

	@AfterClass // Post-condition
	public void afterClass() {
		driver.close();
	}

	@Test // Functional steps
	public void f() throws Exception {
		driver.get("https://blazedemo.com/");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@value='Choose This Flight'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Purchase Flight']")).click();
		Thread.sleep(2000);
		// Get the final page content
		String finalPageText = driver.findElement(By.xpath("(//*[@class='container'])[2]")).getText();
		System.out.println(finalPageText);
	}

	@BeforeClass // Pre-condition
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
