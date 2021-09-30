import java.util.Scanner;

public class RationalApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int denomOne, numOne, numTwo, denomTwo;
		System.out.printf("Enter a numerator: ");
		numOne = input.nextInt();
		System.out.printf("Enter a denominator: ");
		denomOne = input.nextInt();
		Rational rationalOne = new Rational(numOne, denomOne);
		System.out.printf("%nNumerator: %d", rationalOne.getNumerator());
		System.out.printf("%nDenominator: %d", rationalOne.getDenominator());
		

		
		System.out.printf("%n%nEnter a numerator: ");
		numTwo = input.nextInt();
		System.out.printf("Enter a denominator: ");
		denomTwo = input.nextInt();
		Rational rationalTwo = new Rational(numTwo, denomTwo);
		System.out.printf("%nNumerator: %d", rationalTwo.getNumerator());
		System.out.printf("%nDenominator: %d", rationalTwo.getDenominator());
	
		
		
		System.out.printf("%n%n%s",rationalOne.isEqual(rationalTwo));
		System.out.printf("%nThe sum of the rational numbers is: %s", rationalOne.add(rationalTwo));
		System.out.printf("%nThe difference of the rational numbers is: %s", rationalOne.subtract(rationalTwo));
		System.out.printf("%nThe product of the rational numbers is: %s", rationalOne.multiply(rationalTwo));
		System.out.printf("%nThe quotient of the rational numbers is: %s", rationalOne.divide(rationalTwo));
		System.out.printf("%nThe reciprocal of the first rational is: %s", rationalOne.getReciprocal());
		System.out.printf("%nThe reciprocal of the second rational is: %s", rationalTwo.getReciprocal());
		System.out.printf("%nThe first raised to the power of the second is: %.2f", rationalOne.power(rationalTwo));
		

		input.close();
	}

}
