/*
conditional statement

*/
import java.io.Console;
public class loop{

    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("Enter a name ");
        String adjective = console.readLine("Enter an adjective");
		String noun;
        do {
        	noun = console.readLine("Enter a noun: ");
        	if (noun.equalsIgnoreCase("dork") || 
        		noun.equalsIgnoreCase("jerk")) {
        		console.printf("that language is not allowd.");
        	}
        	
        } while(noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
    }
}



