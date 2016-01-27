public class Example {
	public static void main(String[] args){

	System.out.println("we are a making a new pen");
	Constructors my_pen = new Constructors("Dog");
	System.out.println("The pen is %s",my_pen.getcharactername());
	
	if(my_pen.isEmpty()){
		System.out.println("it is empty");
	}
	System.out.println("loading....");
	my_pen.load();
	if(!my_pen.isEmpty()){
		System.out.println("it is no longer empty");
	}
	while (my_pen.dispense()){
		System.out.println("chomp!");

	}
	if (dispense.isEmpty()){
		System.out.println("ate all the pez");
	}


}