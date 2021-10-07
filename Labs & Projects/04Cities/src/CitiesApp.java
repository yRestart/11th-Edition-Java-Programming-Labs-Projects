import java.util.*;

public class CitiesApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		System.out.println();
		System.out.println();

		// Let's keep track of some cities!
		TreeMap<String, TreeSet<String>> atlas = new TreeMap<String, TreeSet<String>>();
		atlas.put("Ohio", new TreeSet<String>());
		atlas.put("New York", new TreeSet<String>());
		atlas.put("Pennsylvania", new TreeSet<String>());
		atlas.put("Florida", new TreeSet<String>());

		atlas.get("New York").add("Utica");
		atlas.get("New York").add("Buffalo");
		atlas.get("Ohio").add("Columbus");
		atlas.get("Ohio").add("Cleveland");
		atlas.get("Pennsylvania").add("Pittsburgh");
		atlas.get("Pennsylvania").add("Scranton");
		atlas.get("Florida").add("Tampa");
		atlas.get("Florida").add("Miami");

		int x = 0;
		while (x <= 0) {
			System.out.println();
			System.out.printf("%n1.View states & cities%n2. Add state %n3. Add cities %n4. Delete state %n5. Delete cities %n6. Quit%n");
			char choice = input.next().charAt(0);
			System.out.println();

			
			String state1, city1;
			switch (choice) {
			// View states and cities
			case '1':
				System.out.println("Current states");
				for (String state : atlas.keySet()) {
					System.out.println(state);
					for (String city : atlas.get(state)) {
						System.out.println("     " + city);
					}
				}
				break;
			// Add state
			case '2':
				System.out.printf("%nWhich state do you want to add: ");
				state1 = input.nextLine();
				atlas.put(state1, new TreeSet<String>());
				
				input = new Scanner(System.in);
				input1 = new Scanner(System.in);
				break;
			// Add Cities
			case '3':
				System.out.printf("%nWhich state do you want the city added to: ");
				state1 = input.nextLine();
				System.out.printf("%nWhich city do you want to add: ");
				city1 = input1.nextLine();
				atlas.get(state1).add(city1);
				
				input = new Scanner(System.in);
				input1 = new Scanner(System.in);
				break;
			// Remove States
			case '4':
				System.out.printf("%nWhich state do you want to removed: ");
				state1 = input.nextLine();
				atlas.remove(state1);
				
				input = new Scanner(System.in);
				input1 = new Scanner(System.in);
				break;
			// Remove Cities
			case '5':
				System.out.printf("%nWhich state do you want the city removed: ");
				state1 = input.nextLine();
				System.out.printf("%nWhich city do you want to removed: ");
				city1 = input1.nextLine();
				atlas.get(state1).remove(city1);


				// clearing buffers of input scanners
				input = new Scanner(System.in);
				input1 = new Scanner(System.in);
				
				break;
			// Quit
			case '6':
				x++;
				break;
			}
			;

		}

	}
}