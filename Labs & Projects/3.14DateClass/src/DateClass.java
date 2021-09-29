
public class DateClass {
	//Variables
	private int dateMonth, dateDay, dateYear;
	//Constructor
	DateClass(int month, int day, int year){
		this.dateDay = day;
		this.dateMonth = month;
		this.dateYear = year;
	}
	
	// Month SET/GET Method
	public void setMonth(int month) {
		this.dateMonth = month;
	}
	public int getMonth() {
		return this.dateMonth;
	}
	
	// Day SET/GET Method
	public void setDay(int day) {
		this.dateDay = day;
	}
	public int getDay() {
		return this.dateDay;
	}
	
	// Year SET/GET Method
	public void setYear(int year) {
		this.dateYear = year;
	}
	public int getYear() {
		return this.dateYear;
	}
	
	// Display Method
	public void getDisplay() {
		System.out.printf("The date is: %d/%d/%d", this.dateMonth,this.dateDay,this.dateYear);
	}

}
