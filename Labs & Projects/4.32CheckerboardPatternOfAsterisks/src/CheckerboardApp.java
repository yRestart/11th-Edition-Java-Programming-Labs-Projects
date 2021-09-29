
public class CheckerboardApp {

	public static void main(String[] args) {

		int x = 0;
		while (x < 4) {
			for (int i = 0; i < 7; i++) 
				System.out.printf("* ");
			
			System.out.println();
			
			for (int i = 0; i < 7; i++) 
				System.out.printf(" *");

			
			System.out.println();
			x++;
		}

	}

}
