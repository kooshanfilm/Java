package org.openqa.selenium.example;

public class mian {
    public static void main(String[] args) throws Exception {
        login call=new login();
        call.loginEM("krostamzadeh","S0dexo2","pita pit","http://beta.vivonet.com/");
        System.out.println("start");
        Thread.sleep(16000);
        //call.smoke_editors();
        //call.smoke_report();
        //call.report_compaire();
        call.get_csv();
    }
}
