package DoLoop;

import java.util.*;

public class DoLoopExersize {

	int i = 0;

	public static void main(String[] args) {

		int i = 0;

		do {

			System.out.println("i :" + i);
			i++;

		} while (i < 10);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter value");
		String input = scanner.next();
		System.out.println("the input is: " + input);

	}

}
