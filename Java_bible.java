Java_bible:

--To print in to the console:
Console console = System.console();
console.print();

--To exit from the console:
System.console(0);

if and else:
	if (variable < x) {
	}

--Parsing String to integer
String age1 = console.readLine("your number")
int age2 = Integer.ParsingInt(age1);

--To compare the Strings 
String name = "james"
if (name.equalsIgnoreCase("james"))

--Using Logical ORs 
if (name.equalsIgnoreCase("a") || name.equalsIgnoreCase("two"))

--do loop
String response;
do {
   response = console.readLine("do you understand do while loops?");
}while(response.equalsIgnoreCase("No"));




