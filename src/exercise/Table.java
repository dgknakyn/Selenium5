package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Table extends BaseClass {
	// https://neotech.vercel.app/tables
	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(1000);

		int row = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[1]/td")).size();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < col; j++) {

				String path = "//table[@id='table2']/tbody/tr[" + i + "]/td[" + j + "]";

				WebElement table = driver.findElement(By.xpath(path));
				System.out.print(table.getText() + " | ");

			}
			System.out.println();
		}

		tearDown();
	}

}
