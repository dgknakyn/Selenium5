package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

/*1) Open chrome browser
2) Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
3) Login to the application
4) Click on the checkbox of all orders with product FamilyAlbum
5) Delete Selected orders
6) Verify the orders have been deleted
7) Quit the browser*/
public class Second extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		Thread.sleep(1000);

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();

		String expected = "FamilyAlbum";
		List<WebElement> orders = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		for (int i = 0; i < orders.size(); i++) {
			String order = orders.get(i).getText();
			if (order.contains(expected)) {
				System.out.println(expected + " is on the list");
				System.out.println(order);
				int orderIndex = i + 1;
				String path = "//table[@class='SampleTable']/tbody/tr[" + orderIndex + "]/td/input";
				driver.findElement(By.xpath(path)).click();
			}
		}
		WebElement updatedOrder = driver.findElement(By.xpath("//table[@class='SampleTable']"));
		if (!updatedOrder.getText().contains(expected)) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		tearDown();
	}
}
