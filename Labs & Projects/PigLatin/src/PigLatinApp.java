import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PigLatinApp {

	static String pigLatin(String input) {
		// Imports input into a list, splits the words by spaces, input.length gives it a dynamic function so it can work for any size of a sentence
		String[] arrayOfString = input.split(" ", input.length());
		String newWord = "";
		String newNewWord = "";
		for (String a : arrayOfString) {
			newWord = a.substring(1) + a.charAt(0) + "ay" + " "; // Takes first letter of each word moves it to the end and adds "ay" & " "
			newNewWord += newWord;
		}

		return newNewWord;
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);
		int x = 1;
		do {
			System.out.printf("\n\nEnter word or phrase to be translated into Pig Latin (Q to quit): ");
			String userString = input.nextLine();
			if (userString.equals("Q")) {
				break;
			}

			System.out.println();
			System.out.println("Original word/phrase: " + userString);
			System.out.printf("Pig Latin word/phrase: %s", pigLatin(userString));
			
			FileOutputStream fout = new FileOutputStream("piglatin.txt"); // new txt file to current directory
			PrintStream output = new PrintStream(fout); // printstream obj
			output.print(pigLatin(userString));
			
		} while (x == 1);

		input.close();
	}

}
