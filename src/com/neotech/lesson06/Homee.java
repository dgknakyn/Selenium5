package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homee extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		
		Alert simpleAlert=driver.switchTo().alert();
		if(simpleAlert.getText().equalsIgnoreCase("You clicked a button")) {
			System.out.println(simpleAlert.getText() + " is present ");
		}else {
			System.out.println("text unavailable ");
		}
		simpleAlert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert secondAlert=driver.switchTo().alert();
		if(secondAlert.getText().equalsIgnoreCase("do you confirm action?")) {
			System.out.println(secondAlert.getText());
		}else {
			System.out.println("Not availab;e");
		}
		secondAlert.accept();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(1000);
		Alert thirdAlert=driver.switchTo().alert();
		Thread.sleep(5000);
		thirdAlert.sendKeys("Dogukan");
		Thread.sleep(5000);
		thirdAlert.accept();
		
		Thread.sleep(3000);
		

		 tearDown();

	}

}
