/*
input from user

*/
import java.io.Console;
public class Strings_variables {
    public static void main(String[] args) {
        Console console = System.console();
        String firstName = console.readLine("what is your name  ");
        console.printf("This is introduction %s\n",firstName);
        console.printf("%s this is learning new lang",firstName);
    }
}