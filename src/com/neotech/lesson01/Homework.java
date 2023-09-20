package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:/www.amazon.com/");

		Thread.sleep(4000);

		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {

			System.out.println("Titles are matchin!!!1");
		} else {

			System.out.println("unmatching titles");
		}

		System.out.println("expected title: " + expectedTitle);
		System.out.println("current title: " + driver.getTitle());

		driver.quit();

	}

}
