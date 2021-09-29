import java.util.Scanner;

public class RationalApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int denominator, numerator;
		System.out.printf("Enter a numerator: ");
		numerator = input.nextInt();
		System.out.printf("Enter a denominator: ");
		denominator = input.nextInt();

		Rational rational = new Rational(numerator, denominator);

		System.out.printf("Numerator: %d", rational.getNumerator());
		System.out.printf("%nDenominator: %d", rational.getDenominator());

		/*
		 * The rational numbers are not equal to each other. 
		 * The sum of the rational numbers is: 13/10 
		 * The product of the rational numbers is: 2/5 
		 * The first raised to the power of the second is: 0.57 
		 * The difference of the rational numbers is: -3/10 
		 * The reciprocal of the first rational is: 2 
		 * The reciprocal of the second rational is: 5/4 
		 * The quotient of the rational numbers is: 5/8
		 */

	}

}
