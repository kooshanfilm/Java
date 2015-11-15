/*
conditional statement

*/
import java.io.Console;
public class parsing_integers
{
    public static void main(String[] args) {
        Console console = System.console();
        String ageAsString = console.readLine("How old are you?");
		int age = Integer.parseInt(ageAsString);
		if (age < 13){
			console.printf("you can use this software");
			System.exit(0);
		}
		      

}
}

