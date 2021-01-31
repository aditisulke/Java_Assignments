package assignments;

public class Accounts {

	public static void main(String[] args) {
		
		
		Manager mn = new Manager( "Aditi",101, 23, 10000, 5000, 5000);
		SalesManager sm = new SalesManager("Ananya", 24, 15000, 2000, 2000, 1000, 3000);
		
//		System.out.println(em.calculateSalary());
		System.out.println(mn.calculateSalary());
		System.out.println(sm.calculateSalary());
	}

}
