import java.util.Scanner;

public class QuadraticFormulaApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a, b, c, root1, root2, imaginaryNum;

		System.out.printf("Enter three doubles: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		double discriminate = b * b - 4 * a * c;

		if (discriminate > 0) {
			root1 = (-b + Math.sqrt(discriminate)) / 2 * a;
			root2 = (-b - Math.sqrt(discriminate)) / 2 * a;

			System.out.printf("Roots%n%.2f%n%.2f%n", root1, root2);
		} else if (discriminate < 0) {
			/*
			 * imaginaryNum = Math.sqrt(-discriminate) / 2 * a;
			 * System.out.printf("Roots%n%.2f ± %.2fi", -b / (2 * a), imaginaryNum);
			 */
			System.out.printf("%nIMAGINARY");
		}

		input.close();
	}

}
