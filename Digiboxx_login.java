package Digiboxx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Digiboxx_login {

	public WebDriver driver;
	
	@BeforeSuite
	public void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rikky\\OneDrive\\Desktop\\Software_Engineering\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apptest.digiboxx.com/login");
		driver.manage().window().maximize();
		driver.get("https://apptest.digiboxx.com/login");
		driver.findElement(By.xpath("//input[@id='workspace']")).sendKeys("intern3");
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("testing2510932@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Gaurav@123");
		WebElement element=driver.findElement(By.xpath("//button[@class='start-btn']"));
		JavascriptExecutor s = (JavascriptExecutor)driver;
		s.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']"))).click();
	}
	
}
