package org.openqa.selenium.example;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Export_report extends login{
	public static void go_over_report() throws InterruptedException{
		System.out.println("Now on Reporting");
     	driver.findElement(By.id("reportingTab2")).click();
     	Thread.sleep(1000);
     	driver.switchTo().frame("mainframe");
        driver.findElement(By.id("ReportSelect")).click();
        Thread.sleep(100);
        Select select =new Select(driver.findElement(By.id("ReportSelect")));
	    //Sales and Operations report
	    select.selectByVisibleText("Sales and Operations");
	    Thread.sleep(5000);
	    write_in_CSS_file();
	    Thread.sleep(5000);
        driver.findElement(By.id("btnRun")).click();
		Thread.sleep(5000);
		//Account Export
	    select.selectByVisibleText("Accounting Export");
	    driver.findElement(By.id("btnRun")).click();
	    Thread.sleep(5000);
	    //Product Sales Mix Export
        select.selectByVisibleText("Product Sales Mix Export");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Tenders Report
        select.selectByVisibleText("Tenders Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        Export_report.write_in_CSS_file();
        Thread.sleep(5000);
        //Daily Close Day Period Report
        select.selectByVisibleText("Daily Close Day Period Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Order Type Report
        select.selectByVisibleText("Order Type Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        select.selectByVisibleText("Order Type Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Weekly Close Day Period Report
        select.selectByVisibleText("Order Type Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Comparative Sales Report
        select.selectByVisibleText("Comparative Sales Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Cashout Report
        select.selectByVisibleText("Cashout Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Comparative Labor Report
        select.selectByVisibleText("Comparative Labor Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Comparative Labor Report
        select.selectByVisibleText("Comparative Labor Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Day Parts Report
        select.selectByVisibleText("Day Parts Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Event Log Report
        select.selectByVisibleText("Event Log Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
        //Theoretical Costs Report
        select.selectByVisibleText("Theoretical Costs Report");
        driver.findElement(By.id("btnRun")).click();
        Thread.sleep(5000);
	   	}

	public static void write_in_CSS_file()
	   {
	   // Switich to the ifrmae report to get the
	   // exctract icon
	   driver.switchTo().frame("iframeReport");
       driver.findElement(By.xpath("//*[@id='ReportViewerControl_ctl05_ctl04_ctl00_ButtonImg']")).click();
       driver.findElement(By.xpath("//*[@id='ReportViewerControl_ctl05_ctl04_ctl00_Menu']/div[2]/a")).click();
       // Switich it back to the main frame
       driver.switchTo().defaultContent();
       driver.switchTo().frame("viewframe");
	   }
}
