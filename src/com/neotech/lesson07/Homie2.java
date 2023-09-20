package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homie2 extends BaseClass {
	/*
	 * 1) Launch the browser and open the site
	 * "https://chercher.tech/practice/frames-example-selenium-webdriver" 2) Verify
	 * on the page header "Not a Friendly Topic" displayed 3) Click on the Inner
	 * Frame Check box 4) Choose baby Cat from Animals dropdown 5) Quit the browser
	 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(2000);
		
		WebElement header=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
		String txt=header.getText();
		
		if(header.isDisplayed()) {
			System.out.println("header is----->> " + txt);
		}else {
			System.out.println("header not available ");
		}
		
	driver.switchTo().frame("frame1");
	Thread.sleep(2000);
	
	driver.switchTo().frame("frame3");
	
		
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	
	WebElement animals=driver.findElement(By.id("animals"));
	animals.click();
	Thread.sleep(1000);
	Select el = new Select(driver.findElement(By.id("animals")));
	el.selectByVisibleText("Baby Cat");
	Thread.sleep(2000);
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
		
	}

}
