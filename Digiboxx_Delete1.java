package Digiboxx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Digiboxx_Delete1 extends Digiboxx_login {
    
	@Test
	public void deletebutton() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox_fol_124406']"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='assets/img/icons/icon-delete.svg']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='confirm_popup_folder']/descendant::button[1]"))).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='btn-margin profile-pop']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='pro-links']/child::li[3]")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox_fol_124406']"))).click();
		
		driver.findElement(By.xpath("//img[@src='assets/img/icons/icon-delete.svg']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='confirm_popup_select_all_recycle']/descendant::button[1]")).click();
		
	}
	
	
	
	
	
}
