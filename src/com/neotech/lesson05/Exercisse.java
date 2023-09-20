package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Exercisse extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Neotech@123");

		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginBtn.click();

		Thread.sleep(5000);

		String header = driver.findElement(By.xpath("//span[@id='account-name']")).getText();

		if (header.equalsIgnoreCase("Jacqueline White")) {
			System.out.println("account name is " + header);
		} else {
			System.out.println("account name is wrong ");
		}

		Thread.sleep(2000);

		tearDown();
	}

}
