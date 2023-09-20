package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dogukan1234 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.google.chrome", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Sabah");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Bushash");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("Sabah123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sabah123@gmail.com");

		driver.findElement(By.name("reg_passwd__")).sendKeys("Albano123");
		Thread.sleep(1000);

		driver.findElement(By.name("websubmit")).click();

		driver.quit();

	}

}
