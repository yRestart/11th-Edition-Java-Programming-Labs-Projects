import java.util.Scanner;

public class MultiplicationTableApp {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in); // Scanner object

		int userInt;
		do {

			// User submits a integer (0-9)
			System.out.print("Enter a integer(0-9): ");
			userInt = myInput.nextInt();

			System.out.format("      ");
			for (int i = 0; i <= userInt; i++) {
				System.out.format("%4d", i);
			}
			System.out.println("\t");
			System.out.print("-----------");
			for (int i = 0; i < userInt; i++) {
				System.out.print("----");
			}
			System.out.println();
			for (int i = 0; i <= userInt; i++) {
				// print left column first
				System.out.format("%4d |", i);
				for (int j = 0; j <= userInt; j++) {
					System.out.format("%4d", i * j);
				}
				System.out.println();
			}

			System.out.println();
		} while ((userInt >= 0) & (userInt <= 9));
		myInput.close();

	}

}
