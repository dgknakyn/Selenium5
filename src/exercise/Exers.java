package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exers {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html");

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html");
		Thread.sleep(3000);

		List<WebElement> element = driver
				.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr/td/label"));

		Thread.sleep(1000);

		for (WebElement el : element) {

			String text = el.getText();
			if (text.equals("Male")) {
				el.click();
			} else if (text.equals("Saturday")) {
				el.click();
				Thread.sleep(3000);
				driver.quit();
			}

		}
	}
}