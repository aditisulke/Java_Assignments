package bankaccount;

public class BankAccount {

	private String name;
	private int accountNumber;
	private int amount;
	
	BankAccount() {
		this.name = null;
		this.accountNumber =  0;
		this.amount = 0;
	}

	public  BankAccount(String name, int accountNumber, int amount){
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	int balance() {
		return getAmount();
	}
	
	
}
