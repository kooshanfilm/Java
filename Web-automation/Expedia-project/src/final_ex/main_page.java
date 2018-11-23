package final_ex;
import java.util.TreeMap;

public class main_page {
	static int going=5;
	static int going_end=8;
	static int  coming_back=15;
	static int  coming_back_end=17;
public static void main(String[] Args) throws InterruptedException{
	GUI call=new GUI();
	call.run_server();
	call.open_web();
	call.Flight("YTO","YVR" );//Choose the name of your airport
	int day_start=1;//When is your starting day
	int end_day=6;//when are you coming back
	int day_finish=3;// How many days to check ?
	call.Date(day_start,"/01/2014", end_day,"/01/2014",day_finish);
	call.get_price(day_start,"/01/2014",end_day, "/01/2014",day_finish);
}

}
