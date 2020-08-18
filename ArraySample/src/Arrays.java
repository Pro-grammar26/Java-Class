
public class Arrays {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		names[0] = "Sahith";
		names[1] = "Sai";
		names[2] = "Scooby";
		
		for(int i = 0; i < names.length; i++ ) {
			System.out.println("name: " + names[i]);
		}
		
		System.out.println("------------------------");
		
		for(Object name : names) {
		System.out.println("name: " + name);	
		}

		System.out.println("------------------------");
		
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
	
		for(int n = 0; n < numbers.length; n++ ) {
			System.out.println("number: " + numbers[n]);
		}

		System.out.println("------------------------");
	
		for(Object number: numbers) {
			System.out.println("number: " + number);
	
		}
	}
}
