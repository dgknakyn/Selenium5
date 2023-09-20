package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://neotechacademy-sis.com:9000/Test/");

		WebElement header = driver.findElement(By.xpath("img#logoTop"));

		System.out.println("the text ia " + header.getText());
		Thread.sleep(2000);

		driver.quit();

	}

}
