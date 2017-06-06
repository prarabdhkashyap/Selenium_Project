import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium_Actions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		// Implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		WebElement product_category = driver.findElement(By
				.xpath(".//*[text()='Simple Alert']"));
		product_category.click();

//		Actions action = new Actions(driver);
//		action.moveToElement(product_category).build().perform();
//		
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
	}

}
