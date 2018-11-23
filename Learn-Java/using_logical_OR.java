/*
conditional statement

*/
import java.io.Console;
public class using_logical_OR
{
    public static void main(String[] args) {
        Console console = System.console();
        String name = "james";
        if (name.equalsIgnoreCase("james") || name.equalsIgnoreCase("bob")){
        	console.printf("your name is James");
        	System.exit(0);
        }
	}
}

