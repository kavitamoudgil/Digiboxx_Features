package Digiboxx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Digiboxx_Language extends Digiboxx_login{

	@Test
   public void languageSettings() throws InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='btn-margin profile-pop']"))).click();
	  
	   driver.findElement(By.xpath("//ul[@class='pro-links']/child::li[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='hindi']/following::span[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//li[@class='btn-margin profile-pop']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//ul[@class='pro-links']/child::li[2]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='hindi']/following-sibling::span")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
	   
	   
	   
   }
	
}
