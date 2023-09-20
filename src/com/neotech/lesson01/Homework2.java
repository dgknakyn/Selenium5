package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		String expectedUrl = "https://www.redfin.com/";

		driver.get(expectedUrl);

		Thread.sleep(3000);

		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.equals(expectedUrl)) {

			System.out.println("matching URL!!");
		} else {

			System.out.println("URl is not matching ");

		}

		driver.quit();

	}

}
