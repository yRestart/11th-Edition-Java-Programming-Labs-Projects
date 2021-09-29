
public class DateApp {

	public static void main(String[] args) {
		DateClass date = new DateClass(0, 0, 0);
		
		int month = 5;
		int day = 13;
		int year = 2000;
		
		date.setMonth(month);
		date.setDay(day);
		date.setYear(year);
		date.getDisplay();
		

	}

}
