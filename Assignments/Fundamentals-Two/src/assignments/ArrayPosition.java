package assignments;
import java.util.Scanner;

public class ArrayPosition {

	public static void main(String[] args) {
	
		int n, position, element;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of Elements to be entered in Array :");
		n=sc.nextInt();
		int a[] = new int[n+1];
		
		System.out.println("Enter all elements: ");

		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter position of element to insert :");
		position = sc.nextInt();
		
		System.out.println("Enter element to enter : ");
		element = sc.nextInt();
		
		for(int i =(n-1); i>= (position-1); i--) {
			a[i+1] = a[i];
		}
		a[position-1]=element;
		
		System.out.println("After inserting element : ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+",");
		}
		System.out.println(a[n]);
		
	}

}
