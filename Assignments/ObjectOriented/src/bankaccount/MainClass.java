package bankaccount;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba = new BankAccount("Aditi", 123, 2343);
		Current cc = new Current("Aditi", 123, 3000);
		Savings sv = new Savings("Aditi", 123, 12345);
		
		System.out.println(ba.balance());
		System.out.println(cc.balance());
		System.out.println(sv.balance());
	}

}
