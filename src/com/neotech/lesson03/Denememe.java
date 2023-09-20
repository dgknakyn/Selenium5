package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Denememe {

	public final static String url = "https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.cssSelector("#email")).sendKeys("Admin");

		driver.findElement(By.cssSelector("#pass")).sendKeys("Neotech$123");

		driver.findElement(By.cssSelector("button#u_0_5_Pb")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
