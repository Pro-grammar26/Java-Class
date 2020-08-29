import java.util.Scanner;
import java.lang.Math;

public class SystemInAdd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two Numbers you want to add");

		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();

		int sum = numberOne + numberTwo;

		System.out.println("The sum of your two numbers are: " + numberOne + "+" + numberTwo + "=" + sum);

	}

}
