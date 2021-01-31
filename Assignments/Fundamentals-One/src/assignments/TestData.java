package assignments;

public class TestData {

	public static void main(String[] args) {
		
		int entered_digit=345;
		int sum=0;
		int backup=entered_digit;
		
		while(entered_digit>0) {
			sum+=entered_digit%10;
			entered_digit=entered_digit/10;
		}
		System.out.println("Entered number is "+backup+" and sum is "+sum);
	}

}
