import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_Methods {

	static WebDriver driver;
	static WebElement element;

	public static WebDriver openBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(url);
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		}
		return driver;
	}

	public static WebElement findElement(String locator, String path) {

		if (locator.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(path));
		} else if (locator.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(path));
		}
		return element;
	}

	public void click() {
		element.click();
	}

	public static void typeAndEnter(String text) {
		element.click();
		element.sendKeys(text);
	}

	public static String getProperty(String element)
			throws IOException {

		File file = new File(
				"C:\\Users\\deepak.kumar\\NBAWorkspace\\Selenium_Franework\\element.properties");
		FileInputStream fileInput = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fileInput);
		String URL = (String) prop.get(element);
		return URL;

	}

}
