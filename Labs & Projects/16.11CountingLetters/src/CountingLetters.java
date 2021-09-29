import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountingLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Set text in a string
		System.out.printf("Enter a string: ");
		String text = input.nextLine();

		// Create a TreeMap to hold letters as key and count as value
		Map<String, Integer> map = new TreeMap<String, Integer>();

		text.replaceAll(" ", "");
		System.out.println(text);

		String[] words = text.split("", text.length());

		for (int i = 0; i < words.length; i++) {

			String key = words[i].toLowerCase();

			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int x = map.get(key);
					x++;
					map.put(key, x);
				}
			}
		}

		// Get all entries into a set
		Set<Map.Entry<String, Integer>> set = map.entrySet();

		// Get key and value from each entry
		for (Map.Entry<String, Integer> entry : set)
			System.out.println(entry.getKey() + "\t" + entry.getValue());

		input.close();
	}

}