
public class InvoiceApp {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(null, null, 0, 0);

		// Test variables
		String partNumber = "XXXX-XXXX-XXXX-XXXX";
		String partDescription = "AVG Technologies AntiVirus 2021";
		int partQuantity = 5;
		double partPrice = 65.99;

		invoice.setPartNumber(partNumber);
		invoice.setPartDescription(partDescription);
		invoice.setPartQuantity(partQuantity);
		invoice.setPartPrice(partPrice);

		System.out.printf("Part number: %s", invoice.getPartNumber());
		System.out.printf("%nPart description: %s", invoice.getPartDescription());
		System.out.printf("%nPart quantity: %d", invoice.getPartQuantity());
		System.out.printf("%nPart Price: $%.2f", invoice.getPartPrice());
		System.out.printf("%nTotal cost: $%.2f ", invoice.getInvoiceAmount());

	}
}
