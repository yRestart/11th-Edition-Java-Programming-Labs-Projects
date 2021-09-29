import java.util.Scanner;

public class EncryptionApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tempNum, number;
		System.out.print("Enter a four-digit code: ");
		number = input.nextInt();

		if (number > 9999 || number < 1000) {
			System.out.println("Please enter a 4 digit number!");
			input.close();
			return;
		}

		// Copy of user input
		tempNum = number;

		// Breaking the number down
		int firstDigit, secondDigit, thirdDigit, fourthDigit;

		fourthDigit = (tempNum + 7) % 10;
		tempNum = tempNum / 10;
		thirdDigit = (tempNum + 7) % 10;
		tempNum = tempNum / 10;
		secondDigit = (tempNum + 7) % 10;
		tempNum = tempNum / 10;
		firstDigit = (tempNum + 7) % 10;

		// Swapping places
		int tempA, tempB, tempC, tempD;
		tempA = thirdDigit;
		tempB = fourthDigit;
		tempC = firstDigit;
		tempD = secondDigit;

		System.out.println();
		System.out.println("Original input: " + number);
		System.out.printf("Encrypted number: %d%d%d%d", tempA, tempB, tempC, tempD);
		input.close();
	}

}
