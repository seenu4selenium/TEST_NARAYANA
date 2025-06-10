package com.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlazeDemo {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please give browsername as Chrome / Firefox / Edge");
		}
		// driver.manage().window().maximize();
	}

	@Test
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
}
