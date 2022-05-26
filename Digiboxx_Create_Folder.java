package Digiboxx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Digiboxx_Create_Folder extends Digiboxx_login{

	@Test
	public void Create_Folder() {
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='add-btn']"))).click();
		
		driver.findElement(By.xpath("//ul[@class='add-pro-opt ng-star-inserted']/child::li[3]/child::a")).click();
		driver.findElement(By.xpath("//input[@id='folderName']")).sendKeys("Kavita1");
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c272-3']")).click();
		driver.findElement(By.xpath("//mat-option[@id='mat-option-13']")).click();
		driver.findElement(By.xpath("//button[@class='start-btn log-btn my-1']")).click();
	}
}
