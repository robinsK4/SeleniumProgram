package actionclasspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
        WebElement doubleclick = driver.findElement(By.id("dblClkBtn"));
        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.doubleClick(doubleclick).build().perform();

	}

}
