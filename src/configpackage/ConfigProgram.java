package configpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigProgram {
	static Properties prop;
	static WebDriver driver;

	public static void main(String[] args) {
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Training\\Selenium\\SeleniumProgram\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome\\chromedriver.exe");
	         driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\gecko\\geckodriver.exe");
	         driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name(prop.getProperty("uname"))).sendKeys(prop.getProperty("uid"));
		driver.findElement(By.name(prop.getProperty("pass"))).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.name(prop.getProperty("loginbtn"))).click();
		
		driver.close();
        
		
		
		
	}

}
