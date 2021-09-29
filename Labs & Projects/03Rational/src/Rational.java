public class Rational {
	// data	
	private int num;
	private int den;

	// constructors
	/**
	 * Constructs a Rational from a numerator and denominator
	 *
	 * @param  n    the numerator
	 * @param  d    the denominator
	 */
	public Rational(int n, int d){
		if (d==0) {
			System.out.println("Cannot divide by 0");
			d=1;
		}
		num = n;
		den = d;
		simplify();
	}

	/**
	 * Constructs a Rational from an integer
	 *
	 * @param  i    the integer. numerator=i, denominator = 1.
	 */
	public Rational(int i) {
		this(i, 1);
	}

	// selectors
	/**
	 * gets numerator
	 *
	 * @return      numerator
	 */
	public int getNumerator(){
		return num;
	}

	/**
	 * gets denominator
	 *
	 * @return      denominator
	 */
	public int getDenominator(){
		return den;
	}

	// manipulators
	/**
	 * Changes numerator, leaving denominator the same
	 *
	 * @param  n    the new numerator
	 */
	public void setNumerator(int n) {
		num = n;
		simplify();
	}

	/**
	 * Changes denominator, leaving numerator the same
	 *
	 * @param  d    the new denominator
	 */
	public void setDenominator(int d) {
		if (d==0)
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
	 * @return      if denominator==0, numerator. otherwise, numerator/denominator.
	 */
	public String toString(){
		// use getNumerator() not num. allows easy implementation changes.
		int n = getNumerator(); 
		int d = getDenominator();
		if (d==1)
			return n+"";
		else
			return n + "/" +d;
	}

	/**
	 * Determines if two rational objects represent the same number.
	 * Both numerator and denominator must be the same.
	 *
	 * @param  r    the rational number to compare against
	 * @return      true if same. false if not.
	 */
	public boolean equals(Object o) {
		if (o instanceof Rational){
			Rational r = (Rational) o;
			return getNumerator()==r.getNumerator() && 
					getDenominator()==r.getDenominator();
		} else
			return false;
	}

	// other methods
	/**
	 * Multiplies one rational by another.
	 *
	 * @param  r    the rational number to multiply by
	 * @return      the resulting rational
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
	 * @param  r    the rational number to add
	 * @return      the resulting rational
	 */
	public Rational add(Rational r) {
		int n1 = getNumerator();
		int n2 = r.getNumerator();
		int d1 = getDenominator();
		int d2 = r.getDenominator();
		Rational product = new Rational(n1*d2 + n2*d1, d1*d2);
		return product;
	}
	
	// utility methods, not for public use	
	private void simplify() {
		int n = getNumerator();
		int d = getDenominator();
		int gcd = GCD(n, d);
		num = n/gcd;
		den = d/gcd;
	}

	private int GCD(int a, int b) {
		if (b==0) 
			return a;
		else
			return GCD(b,a%b);
	}
}