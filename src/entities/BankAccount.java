package entities;

public class BankAccount {

	private int accountNumber;
	private String holder;
	private double accountBalance;

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

	public void withdrawal(double withdrawal) {
		int fine = 5;
		this.accountBalance -= withdrawal + fine;
	}

	public String toString() {
		return ("Account " + getAccountNumber() + ", Holder: " + getOwnerName() + ", Balance: $ "
				+ String.format("%.2f", getAccountBalance()));
	}

}
