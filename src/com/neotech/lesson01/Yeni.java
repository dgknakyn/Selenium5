package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yeni {
	public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("dodo");
		Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-1")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("dodobaba");
		Thread.sleep(3000);
		driver.quit();

		driver.findElement(By.tagName("h1")).getText();
		Thread.sleep(2000);
		driver.quit();

	}

}
