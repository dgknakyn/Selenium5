package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class exercise2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");

		Thread.sleep(1000);

		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();

		Thread.sleep(1000);

		String errorText = driver.findElement(By.xpath("//span[contains(text(),'Password cannot be empty')]"))
				.getText();

		if (errorText.equalsIgnoreCase("Password cannot be empty")) {
			System.out.println("errortext---> " + errorText);
		} else {
			System.out.println("there is no error message");
		}

		Thread.sleep(3000);

		tearDown();

	}

}
