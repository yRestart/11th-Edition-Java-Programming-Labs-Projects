import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // new scanner obj

		// Input
		System.out.print("Enter first integer: ");
		double userInput = input.nextDouble(); 
		System.out.print("Enter second integer: ");
		double userInput1 = input.nextDouble(); 
		System.out.println();

		// Output
		System.out.println("Addition: " + (userInput + userInput1));
		System.out.println("Subtraction: " + (userInput - userInput1));
		System.out.println("Product: " + (userInput * userInput1));
		System.out.println("Division: " + (userInput / userInput1));

		input.close(); // memory leak if not closed

	}

}
