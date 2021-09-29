import java.util.Scanner;

public class RectangularPrismsApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int length, width, height;
		// User Input
		System.out.printf("Enter three integers(spaces between each number): ");
		length = input.nextInt();
		width = input.nextInt();
		height = input.nextInt();
		System.out.println();

		// Calculations
		// Formula 2(lw + lh + wh)
		System.out.printf("Surface Area: %d", 2 * ((length * width) + (length * height) + (width * height))); // surface area
		System.out.printf("\nVolume: %d", (length * width * height)); // volume
		System.out.println();

		// Top View
		System.out.printf("\nTop View (%d x %d)", length, width);
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print("*");
			for (int j = 0; j < length - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Side View
		System.out.printf("Side View (%d x %d)", length, height);
		System.out.println();
		for (int i = 0; i < height; i++) {
			System.out.print("*");
			for (int j = 0; j < length - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// Front View
		System.out.printf("Front View (%d x %d)", width, height);
		System.out.println();
		for (int i = 0; i < width; i++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();

		for (int i = 0; i < width - 1; i++) {
			System.out.print("*");
			for (int j = 0; j < height; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int i = 0; i < width; i++) {
			System.out.print("*");
			System.out.print(" ");
		}
		System.out.println();

		input.close();

	}
}
