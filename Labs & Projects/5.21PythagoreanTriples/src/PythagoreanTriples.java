
public class PythagoreanTriples {

	public static void main(String[] args) {
		int limit = 500;
		for (int side1 = 0; side1 <= limit; side1++) {
			for (int side2 = 0; side2 <= limit; side2++) {
				for (int hypo = 0; hypo <= limit; hypo++) {
					if (Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.sqrt(Math.pow(hypo, 2))) {
						System.out.printf("Pythagorean Triple %d\n", hypo);
						System.out.printf("Side 1: %d, Side 2: %d, Hypo: %d", side1,side2,hypo);
						System.out.println();
						System.out.println();
					}
				}
			}
		}

	}

}
