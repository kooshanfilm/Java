/*
conditional statement

*/
import java.io.Console;
public class review
{
    public static void main(String[] args) {
        Console console = System.console();
	     String name = "james";
	     boolean check_name = name.equals("bob");
	     boolean rest = check_name;
	     console.printf(rest);
	}
}

