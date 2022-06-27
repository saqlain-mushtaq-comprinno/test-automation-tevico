package tevico1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 extends NewTest {
	
	

	
	 @Test 
	 public void test01() throws InterruptedException {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id("signinSrEmail")).sendKeys("maneeshanmc@gmail.com");
	  driver.findElement(By.id("signupSrPassword")).sendKeys("Pro$12345");
	  driver.findElement(By.xpath("/html/body/app-root/app-auth/ng-component/div/div/div[2]/div/div/div[2]/form/div[4]/button")).click();
	  Thread.sleep(6000L);
	  String u = driver.getCurrentUrl();
	  Assert.assertEquals(u,"https://qa.tevi.co/home"); 
	  }
	
		
		  @Test public void testO2() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		  
		  driver.findElement(By.xpath("/html/body/app-root/app-auth/ng-component/div/div/div[2]/div/div/div[1]/p/a")).click();
		  driver.findElement(By.name("name")).sendKeys("saqlain mushtaq");
		  driver.findElement(By.name("email")).sendKeys("saqlain.mushtaq@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("Pro$12345");
		  driver.findElement(By.name("repassword")).sendKeys("Pro$12345"); 
		  driver.findElement(By.xpath("/html/body/app-root/app-auth/ng-component/div/div/div[2]/div/div/div[2]/form/div[6]/label")).click();
		  driver.findElement(By.xpath("/html/body/app-root/app-auth/ng-component/div/div/div[2]/div/div/div[2]/form/div[7]/button")).click(); }
		 
	 
}
