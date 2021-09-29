public class Combination {

	private static boolean useFact;

	/**
	 * Computes some combinations.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			useFact = (i % 2 == 0);
			System.out.println(useFact ? "FACTORIAL METHOD" : "RECURSIVE METHOD");
			System.out.println();
			
			combination(2, 2);
			combination(3, 2);
			combination(4, 3);
			combination(10, 2);
			combination(52, 5);
			combination(60, 4);
			combination(75, 3);
			combination(100, 4);
			System.out.println();
		}
	}

	/**
	 * A method which switches between the two combination methods
	 * @param n the number of things
	 * @param k how many to choose
	 */
	public static void combination(int n, int k) {
		System.out.print(n + " choose " + k + " = ");
		try {
			if (useFact)
				System.out.println(combinationFactorial(n, k));
			else
				System.out.println(combinationRecursive(n, k));
		} catch (ArithmeticException ex) {
			System.out.println("LOL!");
		}
	}

	/**
	 * Computes the factorial of n. Try not to be jealous of glorious
	 * for loop.
	 * 
	 * @param n the number whose factorial to compute
	 * @return n!
	 */
	private static int fact(int n) {
		int prod = 1;
		for (int i = 1; i <= n; prod *= i++)
			;
		return prod;
	}
	
	
	
	// Long GCD
	 static double gcd(long n1, long n2)
	    {
	        double gcd = 1;
	 
	        for (int i = 1; i <= n1 && i <= n2; ++i) {
	            // Checks if i is factor of both integers
	            if (n1 % i == 0 && n2 % i == 0) {
	                gcd = i;
	            }
	        }
	        return gcd;
	    }
	
	/**
	 * Computes the number of ways to take n things k at a time
	 * 
	 * @param n things to choose from
	 * @param k in a group
	 * @return the number of ways to take n things k at a time
	 */
	private static int combinationFactorial(int n, int k) {
		int p = 1;
		k = 1;

		// choosing the smaller value
		if (n - k < k) {
			k = n - k;
		}

		if (k != 0) {
			while (k > 0) {
				p *= n;
				k *= k;

				// gcd of p, k
				double m = gcd(p, k); // dividing by gcd, to simplify

				p /= m;
				k /= m;

				n--;
				k--;
			}
		} else {
			p = 1;
		}
		return p;
	}
	

	/**
	 * Computes the number of ways to take n things k at a time
	 * 
	 * @param n things to choose from
	 * @param k  in a group
	 * @return the number of ways to take n things k at a time
	 */
	public static int combinationRecursive(int n, int k) {
		return fact(n) / (fact(k) * fact(n - k));
	}
}