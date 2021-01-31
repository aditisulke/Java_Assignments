package assignments;

public class Date {
	private int date;
	private String month;
	private int year;
	
	//default constructor
	public Date(){
		this.date = 0;
		this.month = null;
		this.year = 0;
	}
	
	public Date(int date, String month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
		
	}
	
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void main(String[] args) {

		Date d = new Date();
		Date dt = new Date();
		
		System.out.println("Date : "+d.getDate());
		System.out.println("Month :"+d.getMonth());
		System.out.println("Year :"+d.getYear());
		
		System.out.println("-------------");
		
		dt.setDate(13);
		dt.setMonth("April");
		dt.setYear(2020);
		
		System.out.println("Date : "+dt.getDate());
		System.out.println("Month :"+dt.getMonth());
		System.out.println("Year :"+dt.getYear());
	}

}
