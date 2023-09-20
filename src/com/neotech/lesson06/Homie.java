package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homie extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(2000);

		Select selDD = new Select(driver.findElement(By.name("url")));

		System.out.println("The numbers of the departments are " + selDD.getOptions().size());

		Thread.sleep(2000);

		selDD.selectByVisibleText("Computers");
		Thread.sleep(2000);
		
		for(WebElement el:selDD.getOptions())
		{
			System.out.println(el.getText());
			Thread.sleep(1000);
		}
		tearDown();

		
	}
}
