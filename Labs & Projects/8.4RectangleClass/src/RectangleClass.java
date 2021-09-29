
public class RectangleClass {
	// Variables
	private double rectangleWidth;
	private double rectangleLength;

	// Constructor
	public RectangleClass(double length, double width) {
		this.rectangleLength = length;
		this.rectangleWidth = width;
	}

	// Length SET/GET Method
	public void setLength(double length) {
		if (length > 0 & length <= 20) {
			this.rectangleLength = length;
		} else {
			this.rectangleLength = 1;
		}

	}

	public double getLength() {
		return this.rectangleLength;
	}

	// Width SET/GET Method
	public void setWidth(double width) {
		// TEST
		if (width > 0 & width <= 20) {
			this.rectangleWidth = width;
		} else {
			this.rectangleWidth = 1;
		}
	}

	public double getWidth() {
		return this.rectangleWidth;
	}

	// Calculation Area & Perimeter
	public double getRectangleArea() {
		return this.rectangleLength * this.rectangleWidth;
	}

	public double getRectanglePerimeter() {
		return (2 * (this.rectangleLength)) * (2 * (this.rectangleWidth));
	}

}
