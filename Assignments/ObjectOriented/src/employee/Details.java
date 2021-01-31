package employee;

import java.util.Scanner;

public class Details {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		
		EmployeeDao e = new EmployeeDao();
		
		do {
			System.out.println("1) Add Detaials \n 2)Display Details \n 3) Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:  e.addEmp("aditi" ,"Pune");
			break;
			
			case 2:  e.display();
			break;
			}
		}while(choice!=3);
		sc.close();
	}

}
