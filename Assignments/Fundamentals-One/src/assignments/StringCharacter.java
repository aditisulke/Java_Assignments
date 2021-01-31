package assignments;

import java.util.Scanner;

public class StringCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter String :");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		
		System.out.println(name.length());
		
		if(name.length()%2==0) {
			System.out.println("Since enetered character length is Even, middle letter is : "+name.charAt(name.length()/2-1)+" "+(name.charAt(name.length()/2)));
		}else {
			System.out.println("Since enetered character length is Odd, middle letter is : "+name.charAt(name.length()/2));
		}
	}

}
