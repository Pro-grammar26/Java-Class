import java.util.ArrayList;
public class Application {

	public static void main(String[] args) {
		 
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sahith");
		names.add("Sai");
		names.add("Scooby");
		
		for(int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(Object name: names) {
			System.out.println(name);
		}
	}

}
