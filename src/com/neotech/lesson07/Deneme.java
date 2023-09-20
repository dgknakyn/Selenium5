package com.neotech.lesson07;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Deneme extends BaseClass {
	/*
	 * 1) Launch the browser and open the site
	 * "https://www.tutorialspoint.com/selenium/selenium_automation_practice" 2)
	 * Fill in the all text boxes, Choose your preferred radio button, check box and
	 * drop down option EXCEPT Profile Picture (Dissmiss this Section) 3) Click on
	 * the Button and you will see an Alert pops up then click Ok 4) When user
	 * clicks on Ok new Window will open then get All window handles and get the
	 * size and Quit all of them
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(1000);

		driver.findElement(By.name("firstname")).sendKeys("Dogukan");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Akkoyun");
		Thread.sleep(1000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("exp")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("tool")).click();
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.name("continents")));
		s.selectByVisibleText("North America");
		Thread.sleep(1000);
		Select s1 = new Select(driver.findElement(By.name("selenium_commands")));
		s1.selectByVisibleText("Browser Commands");
		Thread.sleep(1000);

		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		Alert simpleAlert = driver.switchTo().alert();
		String txt = simpleAlert.getText();
		System.out.println(txt);
		simpleAlert.accept();

		Thread.sleep(2000);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("Window handles are " + allWindows);
		System.out.println("The number of the windows are " + allWindows.size());
		driver.switchTo().defaultContent();
		driver.close();

		tearDown();

	}

}
