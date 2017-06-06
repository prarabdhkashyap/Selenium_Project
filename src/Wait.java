import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		// Implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath(".//input[@id='identifierId']")).sendKeys(
				"deepak2020rana");
		driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();

		WebElement passowrd = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath(".//input[@name='password']")));
		
		passowrd.sendKeys("test@124");

	}

}
