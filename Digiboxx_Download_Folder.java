package Digiboxx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Digiboxx_Download_Folder extends Digiboxx_login {
	
	@Test
	public void downloadFolder() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox_fol_124392']"))).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/img/icons/icon-download-cloud-grey.svg']"))).click();
		Thread.sleep(2000);
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='action ml-auto download_cloud_blue ng-star-inserted']/child::img"))).click();
		
	}

}
