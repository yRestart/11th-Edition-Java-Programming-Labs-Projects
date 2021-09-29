import java.util.Scanner;

public class EuclideanDistanceApp {

	public static void main(String[] args) {
		// sqrt( [x1 - x2 ]^2 + [c1-c2]^2 )
		boolean x = true;
		while (x = true) {
			Scanner input = new Scanner(System.in);

			System.out.printf("%nEnter dimension (0 to quit): ");
			int dimension = input.nextInt();
			if (dimension == 0) {
				break;
			}

			// Arrays
			double PlotOne[] = new double[dimension];
			double PlotTwo[] = new double[dimension];

			// Calculate Distance
			euclideanDistance(PlotOne, PlotTwo, dimension);

		}

	}

	public static void euclideanDistance(double PlotOne[], double PlotTwo[],int dimension) {
		Scanner input = new Scanner(System.in);
		// User Input
		System.out.printf("Enter point one: ");
		for (int i = 0; i < PlotOne.length; i++) {
			PlotOne[i] = input.nextDouble();
		}
		
		// User Input
		System.out.printf("Enter point two: ");
		for (int i = 0; i < PlotTwo.length; i++) {
			PlotTwo[i] = input.nextDouble();
		}
		
		// Calculation based on dimension
		if (dimension == 1) {
			// 1D distance
			double totalDistance = Math.abs(PlotOne[0] - PlotTwo[0]);
			System.out.printf("%nEuclidean distance: %.2f", totalDistance);
		} else if (dimension == 2) {
			// 2D distance
			double totalDistance = Math.sqrt(Math.pow((PlotTwo[0] - PlotOne[0]), 2) + Math.pow((PlotTwo[1] - PlotOne[1]), 2));
			System.out.printf("%nEuclidean distance: %.2f", totalDistance);

		} else if (dimension == 3) {
			// 3D Distance
			double totalDistance = Math.sqrt(Math.pow((PlotTwo[0] - PlotOne[0]), 2) + Math.pow((PlotTwo[1] - PlotOne[1]), 2) + Math.pow((PlotTwo[2] - PlotOne[2]), 2));
			System.out.printf("%nEuclidean distance: %.2f", totalDistance);
		} else if (dimension == 4) {
			// 4D Distance
			double totalDistance = Math.sqrt(Math.pow((PlotTwo[0] - PlotOne[0]), 2) + Math.pow((PlotTwo[1] - PlotOne[1]), 2) + Math.pow((PlotTwo[2] - PlotOne[2]), 2) + Math.pow((PlotTwo[3] - PlotOne[3]), 2));
			System.out.printf("%nEuclidean distance: %.2f", totalDistance);

		} else {
			System.out.println("%nNo Dimension Given!");
		}
	}

}
