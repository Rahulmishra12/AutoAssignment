package VirgoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class VirgoTest {
	
	public static void main(String args[]) throws Throwable{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://virgoinnovations.com/Virgo/#/app/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("myapp12@mailinator.com");
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("test123");
		driver.findElement(By.name("password_confirmation")).sendKeys("test123");
		Thread.sleep(5);
		driver.findElement(By.xpath("//form/div[5]/button[contains(text(), 'Register')]")).click();
		driver.findElement(By.xpath("//div[@class = 'form-group text-center']/button[@type ='submit']")).click();
		driver.findElement(By.id("LoginID")).click();
		driver.findElement(By.id("login-password")).click();
		driver.findElement(By.xpath("//span[@class='popup-btn-text ng-binding']")).click();
		

	} 

}
