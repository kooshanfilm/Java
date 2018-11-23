package org.openqa.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

*
public class password_reset extends login {
	 public void password_reset() throws InterruptedException{
    	driver.findElement(By.id("iPosTab2")).click();
     	driver.switchTo().frame("viewframe");
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[6]/a")).click();
     	// you are now outside of both frames
     	driver.switchTo().defaultContent();
     	driver.switchTo().frame("mainframe");
     	//FirstName
     	driver.findElement(By.xpath("//*[@id='hTb']/tbody/tr[3]/td[2]/input")).sendKeys("test");;
     	driver.findElement(By.id("ddQuestion")).click();
        Thread.sleep(100);
        Select select =new Select(driver.findElement(By.id("ddQuestion")));
        //Sales and Operations
        select.selectByVisibleText("What was the name your first school?");
        driver.findElement(By.xpath("//*[@id='txtAnswer']")).sendKeys("@");
     	save();
	    }
}

