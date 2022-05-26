package Digiboxx;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Digiboxx_Upload_File extends Digiboxx_login {
	
		
	@Test
	public void upload_File() throws AWTException, InterruptedException {
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='add-btn']"))).click();
		
	    WebElement element = driver.findElement(By.xpath("//ul[@class='add-pro-opt ng-star-inserted']/child::li[1]/child::a"));
	    element.click();
		//driver.findElement(By.xpath("//ul[@class='add-pro-opt ng-star-inserted']/child::li[1]/child::a")).sendKeys("C:\\Users\\rikky\\OneDrive\\Desktop\\First _File.txt");
	    Thread.sleep(2000);
	    
	    uploadFile("C:\\Users\\rikky\\OneDrive\\Desktop\\firstword.docx");
	}
	
	public static void setClipBoard(String file) {
		
		StringSelection object = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(object, null);
	}
	
	
	public static void uploadFile(String filePath) throws AWTException {
		
		setClipBoard(filePath);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}
