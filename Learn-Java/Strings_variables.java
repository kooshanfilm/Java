/*
skip secuence : \n
String firstName = "James";
%s which is format string is think about where do you 
want to call that variable and you need to , and the name of the variable
for example
console.printf("%s is my name here",firstname);
*/

import java.io.Console;
public class Strings_variables {
    public static void main(String[] args) {
        Console console = System.console();
        String firstName = "James";
        console.printf("This is introduction %s\n",firstName);
        console.printf("%s this is learning new lang",firstName);
  }
}