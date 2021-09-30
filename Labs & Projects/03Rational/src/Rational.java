public class Rational {
	// data
	private int num;
	private int den;

	// constructors
	/**
	 * Constructs a Rational from a numerator and denominator
	 *
	 * @param n the numerator
	 * @param d the denominator
	 */
	public Rational(int n, int d) {
		if (d == 0) {
			System.out.println("Cannot divide by 0");
			d = 1;
		}
		num = n;
		den = d;
		simplify();
	}

	/**
	 * Constructs a Rational from an integer
	 *
	 * @param i the integer. numerator=i, denominator = 1.
	 */
	public Rational(int i) {
		this(i, 1);
	}

	// selectors
	/**
	 * gets numerator
	 *
	 * @return numerator
	 */
	public int getNumerator() {
		return num;
	}

	/**
	 * gets denominator
	 *
	 * @return denominator
	 */
	public int getDenominator() {
		return den;
	}

	// manipulators
	/**
	 * Changes numerator, leaving denominator the same
	 *
	 * @param n the new numerator
	 */
	public void setNumerator(int n) {
		num = n;
		simplify();
	}

	/**
	 * Changes denominator, leaving numerator the same
	 *
	 * @param d the new denominator
	 */
	public void setDenominator(int d) {
		if (d == 0)
			System.out.println("Cannot divide by 0");
		else {
			den = d;
			simplify();
		}
	}

	// special methods
	/**
	 * Formats a rational for Strings and printing
	 *
	 * @return if denominator==0, numerator. otherwise, numerator/denominator.
	 */
	public String toString() {
		// use getNumerator() not num. allows easy implementation changes.
		int n = getNumerator();
		int d = getDenominator();
		if (d == 1)
			return n + "";
		else
			return n + "/" + d;
	}

	/**
	 * Determines if two rational objects represent the same number. Both numerator
	 * and denominator must be the same.
	 *
	 * @param r the rational number to compare against
	 * @return true if same. false if not.
	 */
	public boolean equals(Object o) {
		if (o instanceof Rational) {
			Rational r = (Rational) o;
			return getNumerator() == r.getNumerator() && getDenominator() == r.getDenominator();
		} else
			return false;
	}

	// other methods
	/**
	 * Multiplies one rational by another.
	 *
	 * @param r the rational number to multiply by
	 * @return the resulting rational
	 */
	public Rational multiply(Rational r) {
		int n = getNumerator() * r.getNumerator();
		int d = getDenominator() * r.getDenominator();
		Rational product = new Rational(n, d);
		return product;
	}

	/**
	 * Adds one rational by another.
	 *
	 * @param r the rational number to add
	 * @return the resulting rational
	 */
	public Rational add(Rational r) {
		int n1 = getNumerator();
		int n2 = r.getNumerator();
		int d1 = getDenominator();
		int d2 = r.getDenominator();
		Rational product = new Rational(n1 * d2 + n2 * d1, d1 * d2);
		return product;
	}

	// Subtract
	public Rational subtract(Rational r) {
		int fOneTemp = r.getDenominator() * getNumerator();
		int fTwoTemp = getDenominator() * r.getNumerator();
		
		int n = fOneTemp - fTwoTemp;
		int d = getDenominator() * r.getDenominator();
		
		Rational subtract = new Rational(n, d);
		return subtract;
	}

	// Divide
	public Rational divide(Rational r) {
		int n = getNumerator() * r.getDenominator();
		int d = getDenominator() * r.getNumerator();
		Rational divide = new Rational(n, d);
		return divide;
	}

	// Reciprocal
	public Rational getReciprocal() {
		int n = getDenominator();
		int d = getNumerator();
		Rational reciprocal = new Rational(n, d);
		return reciprocal;
	}

	// pow
	public double power(Rational r) {

		double powOneNum = getNumerator();
		double powOneDenom = getDenominator();
		double powOneCalc = powOneNum / powOneDenom;

		double powTwoNum = r.getNumerator();
		double powTwoDenom = r.getDenominator();
		double powTwoCalc = powTwoNum / powTwoDenom;

		double power = Math.pow(powOneCalc, powTwoCalc);
		return power;
	}
	
	// Checking if equal
	public String isEqual(Rational r) {
		if(getNumerator() == r.getNumerator() && getDenominator() == r.getDenominator()) {
			String x = "The rational numbers are equal to each other.";
			return x;
		}else {
			String z = "The rational numbers are not equal to each other.";
			return z;
		}
		
	}

	// utility methods, not for public use
	private void simplify() {
		int n = getNumerator();
		int d = getDenominator();
		int gcd = GCD(n, d);
		num = n / gcd;
		den = d / gcd;
	}

	private int GCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return GCD(b, a % b);
	}

}