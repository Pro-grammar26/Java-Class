import java.util.Scanner;
import java.lang.Math;

public class SystemInSqrt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter number to find sqaure root of");

		double square = scanner.nextDouble();

		double squareRoot = Math.sqrt(square);
		System.out.printf("Square root of number: %f is : %f %n", square, squareRoot);

	}

}
