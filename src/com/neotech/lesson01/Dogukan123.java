package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dogukan123 {
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.google.chrome", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.name("firstName")).sendKeys("Dogukan");
		driver.findElement(By.name("lastName")).sendKeys("Akkoyun");
		driver.findElement(By.name("phone")).sendKeys("6037895823");
		driver.findElement(By.id("userName")).sendKeys("dgkn");
		driver.findElement(By.name("address1")).sendKeys("4 Spring st");
		driver.findElement(By.name("city")).sendKeys("Dover");
		driver.findElement(By.name("state")).sendKeys("NH");
		driver.findElement(By.name("postalCode")).sendKeys("03820");
		driver.findElement(By.name("country")).sendKeys("US");
		driver.findElement(By.name("email")).sendKeys("dodo123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("dodo123");
		driver.findElement(By.name("confirmPassword")).sendKeys("dodo123");

		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);

		// driver.quit();

	}
}
