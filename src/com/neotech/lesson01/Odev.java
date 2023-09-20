package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username = "Tester";
	public static String password = "test";

	public static void main(String[] args) throws InterruptedException {
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username and password
//		Click on login button
//		Then verify "Web Orders" is displayed and also username is displayed right top corner

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// send username and password
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		WebElement header = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/table/tbody/tr/td[1]/h1"));
		System.out.println(header.getText());

		String info = driver.findElement(By.cssSelector("div.login_info")).getText();
		if (info.contains("tester")) {
			System.out.println("user logged in successfully");
		} else {
			System.out.println("user wasnt able to log in");
		}

		driver.quit();

	}

}
