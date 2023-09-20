package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

/*1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed.Switch to the parent window.
6) Quit all browsers*/
public class Homie extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		setUp();
		Thread.sleep(1000);
		
		String mainPage=driver.getWindowHandle();
	
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(3000);
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		
		Iterator<String>it=allWindowHandles.iterator();
		String window1=it.next();
		String window2=it.next();
		
		
		System.out.println(window1);
		System.out.println(window2);
		
		driver.switchTo().window(window2);
		Thread.sleep(1000);
		driver.findElement(By.name("emailid")).sendKeys("dogukan@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.name("btnLogin")).click();
	     Thread.sleep(2000);
	     
	     driver.close();
	     
	     driver.switchTo().window(window1);
	     Thread.sleep(1000);
	     Thread.sleep(2000);
	    
	
		
		
		
		
		
		
		
		
		
		
		tearDown();

	}

}
