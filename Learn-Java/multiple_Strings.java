/*
Creating multiple Strings 
*/
import java.io.Console;
public class multiple_Strings {
    public static void main(String[] args) {
        Console console = System.console();
        String firstName = "James";
        String name = console.readLine("Enter your Username");
        String adjective = console.readLine("Enter your password");
        console.printf("%s is your Username and is Password %s",name,adjective);
    }
}

