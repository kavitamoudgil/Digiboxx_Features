package Digiboxx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Digiboxx_Restore_File extends Digiboxx_login {

	@Test
	public void restoreFile() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox_fol_124392']"))).click();
		
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
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox_fol_124392']"))).click();
		
		driver.findElement(By.xpath("//div[@class='delete-restore-box pt-0 justify-content-end ng-star-inserted']/child::div[2]/child::a")).click();
		
		//driver.findElement(By.xpath("/html//app-root//app-dgb-recycle-bin[@class='ng-star-inserted']/div[1]/article[1]//div[@class='section-title-box']/div[2]/ul[@class='search-filters']/div/div[1]/a[@href='javascript:;']/img")).click();
		
	}
	
}
