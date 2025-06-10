package com.testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class CrossBrowserTestingDemo {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(@Optional("Edge") String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please give browsername as Chrome / Firefox / Edge");
		}
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws Exception {
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		// Get the ALERT text
		System.out.println(driver.switchTo().alert().getText());
		// Click on OK button on Alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}

}
