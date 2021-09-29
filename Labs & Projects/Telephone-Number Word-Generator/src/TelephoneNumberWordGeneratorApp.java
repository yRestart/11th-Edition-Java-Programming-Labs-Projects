import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TelephoneNumberWordGeneratorApp {

	private static Map<Character, char[]> idkwhatimdoing;
	static {
		idkwhatimdoing = new HashMap<Character, char[]>();

		idkwhatimdoing.put(Character.valueOf('0'), new char[] { ' ' });
		idkwhatimdoing.put(Character.valueOf('1'), new char[] { ' ' });
		idkwhatimdoing.put(Character.valueOf('2'), new char[] { 'a', 'b', 'c' });
		idkwhatimdoing.put(Character.valueOf('3'), new char[] { 'd', 'e', 'f' });
		idkwhatimdoing.put(Character.valueOf('4'), new char[] { 'g', 'h', 'i' });
		idkwhatimdoing.put(Character.valueOf('5'), new char[] { 'j', 'k', 'l' });
		idkwhatimdoing.put(Character.valueOf('6'), new char[] { 'm', 'n', 'o' });
		idkwhatimdoing.put(Character.valueOf('7'), new char[] { 'p', 'r', 's' });
		idkwhatimdoing.put(Character.valueOf('8'), new char[] { 't', 'u', 'v' });
		idkwhatimdoing.put(Character.valueOf('9'), new char[] { 'w', 'x', 'y' });
	}

	public static List<String> generateNumbers(String input, String resultSoFar, List<String> allResults) {

		if (input.length() == 0) {
			allResults.add(resultSoFar);
		} else {
			Character nextDigit = Character.valueOf(input.charAt(0));
			char[] mappingArray = idkwhatimdoing.get(nextDigit);
			if (mappingArray != null) {
				String inputTail = input.substring(1);

				for (char nextLetter : mappingArray) {
					generateNumbers(inputTail, resultSoFar + nextLetter, allResults);
				}
			}
		}
		return allResults;

	}

	public static void main(String[] args) throws FileNotFoundException {
		List<String> results = new ArrayList<String>(); // array Obj
		results.sort(null); 
		
		Scanner input = new Scanner(System.in); // scanner obj
		
		// User input
		System.out.printf("Enter a 7 digit number (no 0 or 1): ");
		String num = input.nextLine();

		FileOutputStream fout = new FileOutputStream("numbers.txt"); // new txt file to current directory
		PrintStream output = new PrintStream(fout); // printstream obj
		
		             
		output.print(generateNumbers(num, "", results));
		
		System.out.println("Total words generated: " + results.size());

		output.close();
		input.close();
	}
}
