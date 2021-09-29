import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // scanner obj

		// User Input
		System.out.print("Enter first int: ");
		int a = input.nextInt();
		System.out.print("Enter second int: ");
		int b = input.nextInt();
		System.out.print("Enter third int: ");
		int c = input.nextInt();

		// Calculations and Results
		System.out.println(); // Blank space
		System.out.println("Sum = " + (a + b + c));
		System.out.println("Average = " + (a + b + c) / 3);
		System.out.println("Product = " + (a * b * c));
		System.out.println("Small Int = " + Math.min(a, Math.min(b, c)));
		System.out.println("Large Int = " + Math.max(a, Math.max(b, c)));

		input.close(); // memory leak if left open
	}

}
