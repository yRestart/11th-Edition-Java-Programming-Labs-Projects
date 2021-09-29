import java.util.Scanner;

public class DiamaterCircumAreaofcircleApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // scanner obj

		float radius;
		// User input
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextInt();
		// Diameter
		System.out.printf("Diameter: %.2f", 2 * (radius));
		// Circumference
		System.out.printf("\nCircumference: %.2f", 2 * Math.PI * (radius));
		// Area
		System.out.printf("\nArea: %.2f", Math.PI * (Math.pow(radius, 2)));

		input.close(); // close scanner
	}

}
