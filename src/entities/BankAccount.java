package entities;

public class BankAccount {

	private int accountNumber;
	private String holder;
	protected double accountBalance;

	public BankAccount() {}
	public BankAccount(int accountNumber, String ownerName) {
		this.accountNumber = accountNumber;
		this.holder = ownerName;
	}
	
	public BankAccount(int accountNumber, String ownerName, double value) {
		this.accountNumber = accountNumber;
		this.holder = ownerName;
		deposit(value);
	}

	public String getOwnerName() {
		return holder;
	}

	public void setOwnerName(String ownerName) {
		this.holder = ownerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public double getAmount() {
		return accountBalance;
	}

	public void deposit(double deposit) {
		this.accountBalance += deposit;
	}

	public void withdraw(double amount) {
		int fine = 5;
		this.accountBalance -= amount + fine;
	}

	public String toString() {
		return ("Account " + getAccountNumber() + ", Holder: " + getOwnerName() + ", Balance: $ "
				+ String.format("%.2f", getAccountBalance()));
	}

}
