import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Switch_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		
		WebElement clickElement = driver.findElement(By.id("button1")); 		
			clickElement.click();		
		LinkedHashSet<String> windowsHandles = new LinkedHashSet<String>();
		windowsHandles =  (LinkedHashSet<String>) driver.getWindowHandles();
		String childwindows = "";
		Iterator itr = windowsHandles.iterator();
		
		while (itr.hasNext()){
			childwindows = (String) itr.next();
		}
		driver.switchTo().window(childwindows);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getCurrentUrl());

	}

}
