package Demo.DemoTestoNE;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	DesiredCapabilities capabilities;
	URL url;
	
  @Test
  public void f() throws MalformedURLException {
	  
//	  driver.get("http://www.gmail.com");
//	  WebDriver driver= new FirefoxDriver();
	  
	  

		
		driver.get("https://www.facebook.com");
	  
	  

  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	 //driver= new FirefoxDriver();
	  //driver.get("http://www.gmail.com");
	  url = new URL("http://prarabdhkashyap:30b669a5-834b-456a-ab1a-9f739fc80e35@ondemand.saucelabs.com:80/wd/hub");

		// URL url = new URL ("http://192.168.0.109:4444/wd/hub");
	   capabilities = DesiredCapabilities.firefox();
		// capabilities.setBrowserName("firefox");
		capabilities.setCapability("name", "test_today");
		capabilities.setVersion("45");
		capabilities.setPlatform(Platform.LINUX);
	   driver = new RemoteWebDriver(url, capabilities);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
 
}
