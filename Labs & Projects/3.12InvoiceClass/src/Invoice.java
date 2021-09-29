public class Invoice {
	// Private Variables
	private String invoicePartNumber;
	private String invoicePartDescription;
	private int invoicePartQuantity;
	private double invoicePartPrice;

	// Constructor (string string int double)
	public Invoice(String partNumber, String partDescription, int partQuantity, double partPrice) {
		// Assigning data
		invoicePartNumber = partNumber;
		invoicePartDescription = partDescription;
		invoicePartQuantity = partQuantity;
		invoicePartPrice = partPrice;
	}

	// PartQuantity SET/GET method
	public void setPartNumber(String partNumber) {
		this.invoicePartNumber = partNumber;
	}

	public String getPartNumber() {
		return this.invoicePartNumber;
	}

	// PartQuantity SET/GET method
	public void setPartDescription(String partDescription) {
		invoicePartDescription = partDescription;
	}

	public String getPartDescription() {
		return this.invoicePartDescription;
	}

	// PartQuantity SET/GET method
	public void setPartQuantity(int partQuantity) {
		if (partQuantity < 0) {
			this.invoicePartQuantity = 0;
		} else {
			invoicePartQuantity = partQuantity;
		}
	}

	public int getPartQuantity() {
		return this.invoicePartQuantity;
	}

	// PartPrice SET/GET method
	public void setPartPrice(double partPrice) {
		if (partPrice < 0) {
			this.invoicePartPrice = 0;
		} else {
			this.invoicePartPrice = partPrice;
		}
	}

	public double getPartPrice() {
		return this.invoicePartPrice;
	}

	// Invoice Amount
	public double getInvoiceAmount() {
		return this.invoicePartQuantity * this.invoicePartPrice;
	}

}
