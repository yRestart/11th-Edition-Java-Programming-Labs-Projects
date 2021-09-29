import java.util.Scanner;

public class squareofasterisks2 {

	public static void main(String[] args) {

		// get the side value from the user
		int x = 0;
		System.out.print("Enter a value for x: ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		// print first row of solid stars
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// print middle rows
		for (int i = 0; i < x - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < x - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}		
		
		// print last row of solid stars
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

}