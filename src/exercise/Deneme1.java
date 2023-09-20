package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Deneme1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='calDispValueCont icon-Calendar  ']")).click();
		Thread.sleep(1000);

		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		while (!month.equals("January")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();

		}
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
		for (WebElement el : days) {
			String dayNum = el.getText();
			if (dayNum.equals("16")) {
				el.click();
				break;
			}
		}
		String returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		while (!returnMonth.equals("March")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			returnMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));

		for (WebElement d : dates) {
			String returnDate = d.getText();
			if (returnDate.equals("13")) {
				d.click();
				break;
			}
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='done']")).click();

		tearDown();

	}

}
