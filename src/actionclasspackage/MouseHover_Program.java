package actionclasspackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Program {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement category =  driver.findElement(By.xpath("//*[@id='nav-shop']/a/span[2]"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(category).perform();
        
        WebElement echo =  driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/child::*[2]/span[1]/span"));
        action.moveToElement(echo).perform();
        Thread.sleep(1000);
        
        WebElement amazonecho =  driver.findElement(By.xpath("//span[contains(text(),'Amazon Echo')]"));
        action.moveToElement(amazonecho).build().perform();
        
        
        

	}

}
