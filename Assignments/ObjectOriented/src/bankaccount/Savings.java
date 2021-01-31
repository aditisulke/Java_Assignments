package bankaccount;

public class Savings extends BankAccount{
	int savingsInt;

	/**
	 * @param savingsInt
	 */
	public Savings(String name,  int accountNumber, int savingsInt) {
		super();
		this.savingsInt = savingsInt;
	}

	public int getSavingsInt() {
		return savingsInt;
	}

	public void setSavingsInt(int savingsInt) {
		this.savingsInt = savingsInt;
	}
	int balance() {
		return getAmount()+getSavingsInt();
	}
}
