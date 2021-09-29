import java.util.Scanner;

public class DecryptionApp {

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
		fourthDigit = tempNum % 10;
		tempNum = tempNum / 10;
		thirdDigit = tempNum % 10;
		tempNum = tempNum / 10;
		secondDigit = tempNum % 10;
		tempNum = tempNum / 10;
		firstDigit = tempNum % 10;

		if (firstDigit < 7)
			firstDigit += 10;
		if (secondDigit < 7)
			secondDigit += 10;
		if (thirdDigit < 7)
			thirdDigit += 10;
		if (fourthDigit < 7)
			fourthDigit += 10;

		firstDigit -= 7;
		secondDigit -= 7;
		thirdDigit -= 7;
		fourthDigit -= 7;

		// Swapping places
		int tempA, tempB, tempC, tempD;
		tempA = thirdDigit;
		tempB = fourthDigit;
		tempC = firstDigit;
		tempD = secondDigit;

		System.out.println();
		System.out.println("Original input: " + number);
		System.out.printf("Decrypted number: %d%d%d%d", tempA, tempB, tempC, tempD);
		input.close();
	}

}
