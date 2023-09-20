package exercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Neo extends BaseClass {
	/*
	 * Open chrome browser Go to https://www.aa.com/homePage.do Enter From and To
	 * Select departure as December 14 of 2022 Select arrival as December 22 of 2022
	 * Click on search Close browser
	 */
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[1]/div/button")).click();

		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while (!month.equals("December")) {

			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			Thread.sleep(1000);
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}

		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement el : days) {
			String dayNum = el.getText();
			if (dayNum.equals("14")) {
				el.click();
				break;

			}
		}
		driver.findElement(By.xpath("//button[text()='Close']")).click();

		String returnMonth = driver
				.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[2]/div/button")).getText();

		while (!returnMonth.equals("December")) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			Thread.sleep(1000);
			returnMonth = driver.findElement(By.xpath("//*[@id=\\\"ui-datepicker-div\\\"]/div[1]/div/div/span[2]"))
					.getText();
		}
		List<WebElement> returnDays = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement day : returnDays) {
			String retdays = day.getText();
			if (retdays.equals("22")) {
				day.click();
				Thread.sleep(2000);
				break;
			}
		}
		Thread.sleep(3000);
		tearDown();

	}

}
