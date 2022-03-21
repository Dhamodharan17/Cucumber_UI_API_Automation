package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FacebookLoginScreenPage {
	
	public  WebDriver driver;
	public FacebookLoginScreenPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void launchBrowser() {
	}
	
	public void enterCredentials() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("berlin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1234");	
	}
	
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
