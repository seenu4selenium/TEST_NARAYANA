package com.testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClass {

	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		// Scroll into view code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("alertButton")));
		Thread.sleep(2000);

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		// Get the ALERT text
		System.out.println(driver.switchTo().alert().getText());

		// Click on OK button on Alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		// Scroll to the element
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("confirmButton")));

		// Click on third CLICKME button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		// Click on Cancel button on Confirmation Alert
		driver.switchTo().alert().dismiss();

	}

}
