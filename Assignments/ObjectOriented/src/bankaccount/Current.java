package bankaccount;

public class Current extends BankAccount{
	int currentInt;

	/**
	 * @param name 
	 * @param currentInt
	 * @param accountNumber 
	 */
	public Current(String name, int currentInt, int accountNumber) {
		super();
		this.currentInt = currentInt;
	}

	public int getCurrentInt() {
		return currentInt;
	}

	public void setCurrentInt(int currentInt) {
		this.currentInt = currentInt;
	}
	
	int balance() {
		return getAmount()+getCurrentInt();
	}
	
}