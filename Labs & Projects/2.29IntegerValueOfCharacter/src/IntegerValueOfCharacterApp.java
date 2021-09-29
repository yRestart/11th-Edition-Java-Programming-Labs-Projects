
public class IntegerValueOfCharacterApp {

	public static void main(String[] args) {

		int[] myNumber = { 'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' ' }; //

		for (int i = 0; i < myNumber.length; i++) {
			System.out.printf("The character '%c' has the value %d%n", myNumber[i], ((int) myNumber[i]));
		}

	}

}
