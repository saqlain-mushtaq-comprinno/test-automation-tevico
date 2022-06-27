package tevico1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	Properties property = new Properties();
	WebDriver driver;
	String ProjectPath = System.getProperty("user.dir");

	@BeforeMethod
	public void web() throws IOException {

		InputStream input = new FileInputStream("/home/saqlain/eclipse-workspace/tevico/config.properties");
		property.load(input);
		String browserName = property.getProperty("browser");
        String OS = System.getProperty("os.name"); 
        
		if (OS.contains("Linux")) {
    	switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/resouces/chromedriver");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/resouces/geckodriver");
				driver = new FirefoxDriver();
				break;
			}}
		else if (OS.contains("Windows")){	
		switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/resouces/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/resouces/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			}}
		else if (OS.contains("Mac")){	
		switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/resouces/chromedriver");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/resouces/geckodriver");
				driver = new FirefoxDriver();
				break;
			}}
		
			driver.get(property.getProperty("url"));
			}


	@AfterMethod
	public void exit() {

		/* driver.quit(); */
	}
}
