package final_ex;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriverService;

public class GUI {
	private static ChromeDriverService service;
	static WebDriver driver;
	static int counter=1;
	static TreeMap<String,Integer> price_list=new TreeMap<String,Integer>();
	public void run_server() {
	service = new ChromeDriverService.Builder()
	.usingDriverExecutable(new File("c:/x/chromedriver.exe"))
	.usingAnyFreePort()
	.build();
	try {
	service.start();
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	driver = new RemoteWebDriver(service.getUrl(),
	DesiredCapabilities.chrome());
	}

public void open_web(){
	driver.get("http://www.expedia.ca");
	}
public void Flight(String going_air_port,String coming_air_port) throws InterruptedException{
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='popupClose']")).click();
driver.findElement(By.xpath("//*[@id='F-origin']")).sendKeys(going_air_port);
//driver.findElement(By.xpath("//*[@id='origin']")).clear();
driver.findElement(By.xpath("//*[@id='F-destination']")).sendKeys(coming_air_port);
}
public void Date(int day,String Going_date,int end_day,String coming_back,int day_finish) throws InterruptedException{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='F-fromDate']")).click();
	driver.findElement(By.xpath("//*[@id='F-fromDate']")).clear();
	Integer.toString(day);
	Integer.toString(end_day);
	driver.findElement(By.xpath("//*[@id='F-fromDate']")).sendKeys(day+""+Going_date);
	driver.switchTo().frame("CalFrame_DPD");
	driver.findElement(By.xpath("//*[@id='closeText']")).click();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@id='F-toDate']")).click();
	driver.findElement(By.xpath("//*[@id='F-toDate']")).clear();
	driver.findElement(By.xpath("//*[@id='F-toDate']")).sendKeys(end_day+""+coming_back);
	driver.switchTo().frame("CalFrame_DPD");
	driver.findElement(By.xpath("//*[@id='closeText']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@id='F-searchButtonExt1']")).click();
	//System.out.println(counter);
	if(counter<day_finish){
		int dayc=day+1;
		Integer.toString(dayc);
		String Goingback=Going_date;
		String Goingbackc=coming_back;
		int day_finishc=day_finish;
		int end=end_day+1;
		Integer.toString(end);
		get_price(dayc,Goingback,end,Goingbackc,day_finish);
		//System.out.println(counter);
	}
	}

public void get_price(int day,String Going_date,int end_day,String coming_back,int day_finish) throws InterruptedException{
	Thread.sleep(5000);
	String price=driver.findElement(By.xpath("//*[@id='type3TotalPrice0']")).getText();
	//System.out.println("Price for "+day+Going_date+ price);
	driver.findElement(By.xpath("//*[@id='tab-home']/a/span")).click();
	if (counter==1){
		driver.findElement(By.id("appDLcloseBtn")).click();
		}
	counter++;
	Date(day,Going_date,end_day,coming_back,day_finish);
	//System.out.println("price is "+price );
	price_list.put(price, day);
	String cheep=price_list.firstKey();
	//	System.out.println("counter is" +counter);
	if (day_finish+1==counter+1){
		print(cheep,Going_date);
	}
}
public void print(String cheep,String day){
	System.out.println("The cheepest ticket is ");
	System.out.println(cheep);
	}
}




