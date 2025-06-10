package com.testngDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementCount {

	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		// Get all radiobutton
		List<WebElement> allRadioButton = driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println("Radio buttons count is: " + allRadioButton.size());

		// Get all editbox
		List<WebElement> allEditboxes = driver.findElements(By.xpath("//input"));
		System.out.println("Editboxes count is: " + allEditboxes.size());

		// button:tagname-button
		List<WebElement> allButtons = driver.findElements(By.xpath("//button"));
		System.out.println("Buttons count is: " + allButtons.size());

		// Checkboxes
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Checkboxes count is: " + allCheckboxes.size());

		// dropdown: tagname-select
		List<WebElement> allDropdowns = driver.findElements(By.xpath("//select"));
		System.out.println("Dropdowns count is: " + allDropdowns.size());

		// hyperlinks: tagname-a
		List<WebElement> allHyperlinks = driver.findElements(By.xpath("//a"));
		System.out.println("Hyperlinks count is: " + allHyperlinks.size());

		// image: tagname-img
		List<WebElement> allimagess = driver.findElements(By.xpath("//img"));
		System.out.println("Images count is: " + allimagess.size());

		int totalElementCount = allRadioButton.size() + allEditboxes.size() + allButtons.size()
				+ allCheckboxes.size() + allDropdowns.size() + allHyperlinks.size() + allimagess.size();
		System.out.println("Total webpage element count is : "+ totalElementCount);

	}
}
