package screeshotpackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshot_Failed_Testcases {
	
	public static WebDriver driver;
	
	public static String timestamp(){
		return new SimpleDateFormat("YYYY-MM-DD HH-MM-SS").format(new Date());
	}
	
	public static void takescreenshot(String filename_) throws IOException{
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:/screenshot/"+filename_+timestamp()+".jpeg"));
	}


    	@BeforeMethod	
    	public void setup() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//takescreenshot("mercury_loginPage");
		
		
    	}
    	
    	@Test
    	public void login() throws IOException{
    		driver.findElement(By.id("email")).sendKeys("robinsk4@gmail.com");
    		driver.findElement(By.id("pass")).sendKeys("artificialintelligence");
    		driver.findElement(By.xpath("//input[@type='submit']")).click();
    		takescreenshot("mercury_FailedloginTest");
    	
	}
    	@AfterTest
    	public void teardown(ITestResult result){
    		if(ITestResult.FAILURE==result.getStatus()){
    			System.out.println("Test Failed");
    		} else{
    			System.out.println("Test Passed");
    		}
    		driver.close();
    	}

}
