package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ornek {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		String actualUrl = "https://www.zillow.com/";

		Thread.sleep(2000);

		driver.navigate().to("https://www.zillow.com/");

		Thread.sleep(2000);

		driver.navigate().to("https://www.google.com/");

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().refresh();

		Thread.sleep(2000);

		if (driver.getCurrentUrl().contains("zillow")) {

			System.out.println("url contains zillow");
		} else {

			System.out.println("url doesnt contain zillow");
		}

		driver.quit();

	}

}
