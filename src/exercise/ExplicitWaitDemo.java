package exercise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(1000);

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("total rows are " + row.size());

		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("cols numbers are " + col.size());

		List<WebElement> all = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("all of them are " + all.size());

		List<WebElement> header = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (WebElement el : header) {
			String headerText = el.getText();
			System.out.print(headerText + " | ");
		}
		System.out.println();

		System.out.println("======================================");
		List<WebElement> ron = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		Iterator<WebElement> it = ron.iterator();
		while (it.hasNext()) {
			String getRon = it.next().getText();
			System.out.print(getRon + " | ");
		}
		System.out.println("===========================");

		for (int i = 1; i <= col.size(); i++) {
			String path = "//table/tbody/tr[1]/td[" + i + "]";
			WebElement cell = driver.findElement(By.xpath(path));
			System.out.print(cell.getText() + " | ");

		}
		System.out.println();

		for (int i = 1; i <= row.size(); i++) {
			for (int j = 1; j < col.size(); j++) {
				String path = "//table/tbody/tr[" + i + "]/td[" + j + "]";
				WebElement allCell = driver.findElement(By.xpath(path));
				System.out.print(allCell.getText() + " | ");

			}
			System.out.println();
		}

		tearDown();

	}

}
