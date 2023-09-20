package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class TableDow extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		Thread.sleep(1000);

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();
			if (rowText.contains("Susan McLaren")) {
				System.out.println("passed");

				String path = "//table[@class='SampleTable']/tbody/tr[" + i + "]/td[13]";
				driver.findElement(By.xpath(path)).click();
				break;

			}
		}
		Thread.sleep(5000);

		tearDown();

	}

}
