package Digiboxx;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Didiboxx_Upload_Folder extends Digiboxx_login {
	
	@Test
	public void upload_Folder() throws InterruptedException, AWTException {
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='add-btn']"))).click();
		
		driver.findElement(By.xpath("//ul[@class='add-pro-opt ng-star-inserted']/child::li[2]/child::a")).click();
		Thread.sleep(2000);
		
		uploadFolder("C:\\Users\\rikky\\OneDrive\\Desktop\\FirstUploadDownload");
		
		}
	
	
	

    public static void setClipBoard(String file) {
		
		StringSelection object = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(object, null);
	}
	
	
	public static void uploadFolder(String filePath) throws AWTException, InterruptedException {
		
		setClipBoard(filePath);
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
						
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}
	
	
	
	
}
