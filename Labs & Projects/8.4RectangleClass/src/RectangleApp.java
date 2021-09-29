
public class RectangleApp {

	public static void main(String[] args) {
		RectangleClass rect = new RectangleClass(0, 0);
		double length = 5;
		double width = 5;

		rect.setLength(length);
		rect.setWidth(width);

		System.out.printf("Area: %.2f", rect.getRectangleArea());
		System.out.printf("%nPerimeter: %.2f", rect.getRectanglePerimeter());

	}

}
