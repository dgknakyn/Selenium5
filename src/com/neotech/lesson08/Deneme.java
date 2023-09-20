package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Deneme extends BaseClass {
	/*
	 * 1. Open chrome browser 2. Go to "https://the-internet.herokuapp.com/" 3.
	 * Click on the “Dynamic Controls” link 4. Click on enable button
	 * 
	 * 5. Enter “Hello” and verify text is entered successfully 6. Close the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement s = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-example\"]/button")));
		s.click();

		driver.findElement(By.xpath("//form[@id='input-example']/p")).sendKeys("Hello");
		WebElement s1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		s.click();

		Thread.sleep(3000);

		tearDown();

	}
}
