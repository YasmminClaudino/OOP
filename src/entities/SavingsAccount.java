package entities;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;

	public SavingsAccount(int accountNumber, String ownerName, double value, double interestRate) {
		super(accountNumber, ownerName, value);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		accountBalance += accountBalance * interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
}
