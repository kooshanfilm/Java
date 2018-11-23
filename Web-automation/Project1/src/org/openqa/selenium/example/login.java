package org.openqa.selenium.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriverService;

public class login  {
	private static ChromeDriverService service;
	static WebDriver driver;
	public login() {
   	 service = new ChromeDriverService.Builder()
        .usingDriverExecutable(new File("c:/x/chromedriver.exe"))
        .usingAnyFreePort()
        .build();
   	 try {
		service.start();
	} catch (IOException e) {
		// TO--Do Auto-generated catch block
		e.printStackTrace();
	}
   	 driver = new RemoteWebDriver(service.getUrl(),
        DesiredCapabilities.chrome());
	}

	String name;
	String value;
	public void get_csv(){
    	try{
    		Export_report.go_over_report();
    	}
    	catch(Exception e){
    		System.out.println("catch now ");
    	}
    }
    public  void loginEM(String username,String password,String company,String url) throws Exception {
    	driver.get(url);
        driver.findElement(By.id("IDToken1")).sendKeys((username));
     	driver.findElement(By.id("IDToken2")).sendKeys((password));
     	driver.findElement(By.id("IDToken3")).sendKeys((company));
     	driver.findElement(By.id("IDToken3")).sendKeys(Keys.ENTER);
        }
    // This function will smoke test all reports
    public void smoke_report() throws InterruptedException{
     	System.out.println("Now on Reporting");
     	driver.findElement(By.id("reportingTab2")).click();
     	Thread.sleep(1000);
        driver.switchTo().frame("mainframe");
        driver.findElement(By.id("ReportSelect")).click();
        Thread.sleep(100);
        Select select =new Select(driver.findElement(By.id("ReportSelect")));
        //Sales and Operations
        select.selectByVisibleText("Sales and Operations");
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

        // This function will smoke test all editors
    public void smoke_editors() throws InterruptedException{
 	    //System.out.println("Editors Page Now ");
     	driver.findElement(By.id("iPosTab2")).click();
        driver.switchTo().frame("viewframe");
     	//Add menu items
     	driver.findElement(By.xpath("//*[@id='links']/span[1]/span[1]/a")).click();
     	sleep(5000);
     	//Add/Change items
     	driver.findElement(By.xpath("//*[@id='links']/span[1]/span[2]/a")).click();
     	sleep(5000);
     	//Change menus
     	driver.findElement(By.xpath("//*[@id='links']/span[2]/span[1]/a")).click();
     	sleep(5000);
     	//Change modifire windos
     	driver.findElement(By.xpath("//*[@id='modifierWindows']/a")).click();
     	sleep(5000);
     	//Add/change preset tare weights
     	driver.findElement(By.xpath("//*[@id='links']/span[2]/span[3]/a")).click();
     	sleep(5000);
     	//Add/change reason
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[2]/span[4]/a")).click();
     	sleep(5000);
     	//Change oreder types
     	driver.findElement(By.xpath("//*[@id='links']/span[2]/span[5]/a")).click();
     	//Add/change meal periods
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[3]/span[1]/a")).click();
     	sleep(5000);
     	//Add/change major groups
     	driver.findElement(By.xpath("//*[@id='links']/span[3]/span[2]/a")).click();
     	//Add/change family groups
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[3]/span[3]/a")).click();
     	sleep(5000);
     	//Add/change accounts
     	driver.findElement(By.xpath("//*[@id='links']/span[3]/span[4]/a")).click();
     	//Add/change tax classes
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[3]/span[6]/a")).click();
     	//Add/change taxes
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[3]/span[6]/a")).click();
     	//Add/change discounts/svc chgs
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='linkDiscounts']")).click();
     	//Add/change tenders
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[4]/span[2]/a")).click();
     	//Add/change currencies
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[4]/span[3]/a")).click();
     	//Add/change employees
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[1]/a")).click();
     	//Change employee/clock times
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[2]/a")).click();
     	//Change multiple clock times
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[3]/a")).click();
     	//Add/change job codes
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[4]/a")).click();
     	//Add/change employee classes
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[5]/a")).click();
     	//Change personal settings
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[5]/span[6]/a")).click();
     	//Stores configuration
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[6]/span/a")).click();
     	//Printer configuration
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[7]/span[1]/a")).click();
     	//Add/change receipts/reports
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[7]/span[2]/a")).click();
     	//Add/change headers/trailers
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[7]/span[3]/a")).click();
     	//Upload images
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[7]/span[4]/a")).click();
     	//Integrated payment tenders
     	sleep(5000);
     	driver.findElement(By.xpath("//*[@id='links']/span[8]/span[1]/a")).click();

    }
    public void sleep(int num) throws InterruptedException{
    	Thread.sleep(num);
    }
    // Click on Save button
    public void save(){
	//Click on Save
    	driver.switchTo().defaultContent();
    	driver.findElement(By.xpath("//*[@id='tdL']/a[1]/span")).click();
   }
    // Going to report and get a value from gross sales
    public void report_compaire() throws InterruptedException{
    //System.out.println("Now on Reporting ");
       driver.findElement(By.id("reportingTab2")).click();
       Thread.sleep(1000);
       driver.switchTo().frame("mainframe");
       // Find the quick Select
       Select quickselect=new Select(driver.findElement(By.id("QuickSelect")));
       //Choose last Month
       quickselect.selectByVisibleText("Last Month");
       //Click on Run button
       driver.findElement(By.id("btnRun")).click();
       driver.switchTo().frame("iframeReport");
       Thread.sleep(13000);
       }
   // Printing in to the file
   public static void write_log(String name ){
	   try {
        File file = new File("/users/krostamzadeh/filename.txt");
    	// if file doesn't exists, then create it
	    if (!file.exists()) {
		    file.createNewFile();
		}
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name);
		bw.newLine();
		bw.close();
		System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
        }
   }
}



