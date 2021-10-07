
import java.util.Scanner;


public class StringToASCII {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Set text in a string
		System.out.printf("Enter a string: ");
		String text = input.nextLine();

		

		text.replaceAll(" ", "");
		System.out.println(text);

		String[] words = text.split("", text.length());
		
		int asciiValueAvg = 0;
		System.out.println();
		for(int i = 0; i < text.length(); i++) {
			// Breaking down string to a char
			char character = words[i].charAt(0);
			// Getting ascii value
			int asciiValue = (int) character;
			// Adding all ascii values
			asciiValueAvg += asciiValue;
			System.out.printf("%s - %d %n",words[i], asciiValue);
			
		}
		
		// Dividing by string length
		asciiValueAvg = asciiValueAvg / words.length;
		System.out.printf("%nAverage: %c ",(char) asciiValueAvg);

	}

}
