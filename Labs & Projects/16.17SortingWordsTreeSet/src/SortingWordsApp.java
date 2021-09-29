import java.util.Scanner;
import java.util.TreeSet;

public class SortingWordsApp {

	public static void main(String args[]) {

		TreeSet<String> randomWords = new TreeSet<String>();

		// input
		Scanner input = new Scanner(System.in);
		String line;
		System.out.printf("Enter a sentence: ");
		line = input.nextLine();
		
		String[] list = line.split("\\s");

		for (int i = 0; i < list.length; i++) {
			// add to TreeSet
			randomWords.add(list[i]);
		}

		System.out.println("TreeSet: " + randomWords);

		input.close();
	}
}