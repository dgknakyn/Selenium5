package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.neotechacademy.com/");

		String title = driver.getTitle();
		System.out.println("title--> " + title);

		Thread.sleep(5000);// 5000 milliseconds = 5 seconds

		driver.quit();
	}

}
