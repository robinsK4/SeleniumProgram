package log4jpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jProgram {
	static Logger log = Logger.getLogger(Log4jProgram.class);

	public static void main(String[] args) {
		 
		PropertyConfigurator.configure("log4j.properties");
		 
         System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         log.info("Browser Launched");
         
         driver.get("http://newtours.demoaut.com/");
         log.info("Application Launched");
         
         driver.findElement(By.name("userName")).sendKeys("mercury");
         log.info("Uername Entered");
         driver.findElement(By.name("password")).sendKeys("mercury");
         log.info("password Entered");
         driver.findElement(By.name("login")).click();
         log.info("Login button clicked");
         
         driver.close();
         
		

	}

}
