
public class Application {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Sahith's";
		person1.age = 15;
		person1.console = "XboxOne";
		person1.animal = "Bear";

		System.out.println(person1.name + " age is " + person1.age);
		System.out.println(person1.animal + " is Sahith's favorite animal");
		System.out.println(person1.name + " gaming console is an " + person1.console);
		
	}

}
