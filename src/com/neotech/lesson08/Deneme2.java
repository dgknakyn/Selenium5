package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Deneme2 extends BaseClass {
	/*
	 * TC 2: Verify element is clickable
	 * 
	 * 1. Open chrome browser 2. Go to "https://the-internet.herokuapp.com/" 3.
	 * Click on the “Dynamic Controls” link 4. Select checkbox and click Remove
	 * 
	 * 5. Click on Add button and verify “It's back!” text is displayed 6. Close the
	 * browser
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")))
				.getText();
		System.out.println("The firts message is--->> " + message);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		// WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		String text2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")))
				.getText();
		System.out.println("The second message is " + text2);
		if (text2.equalsIgnoreCase("It's back!")) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		tearDown();

	}

}
