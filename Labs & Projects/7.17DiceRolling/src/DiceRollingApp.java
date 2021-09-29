import java.util.ArrayList;
import java.util.Random;

public class DiceRollingApp {
	
	// Get occurrences for table
	static int countOccurrences(ArrayList<Double> myDiceTable, int tableSize, int x) {
		int occurrence = 0;
		for (int i = 0; i < tableSize; i++)
			if (x == myDiceTable.get(i))
				occurrence++;
		return occurrence;
	}

	public static void main(String[] args) {
		Random random = new Random(); // Initializing random
		ArrayList<Double> myDiceTable = new ArrayList<>();

		// Add elements to table
		for (int i = 0; i < 36000000; i++) {
			double roll_one = random.nextInt(6) + 1;
			double roll_two = random.nextInt(6) + 1;
			double calculation = roll_one + roll_two;
			myDiceTable.add(calculation);
		}
		
		// size of table into a integer
		int tableSize = myDiceTable.size();
		myDiceTable.sort(null);

		for (int i = 1; i < tableSize; i++) {
			// Make sure it only prints 2-12
			if (i > 1 & i < 13) {
				System.out.printf("%,d occured: %,d times", i, countOccurrences(myDiceTable, tableSize, i));
				System.out.println();
			}
		}
		System.out.printf("Dice rolled: %,d", tableSize);
	}

}
