package entities;

public class BusinessAccount extends BankAccount{

	private double loanLimit;
	
	public BusinessAccount() {}

	public BusinessAccount(int accountNumber, String ownerName, double value, double loanLimit) {
		super(accountNumber, ownerName, value);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount < loanLimit) {
			accountBalance += amount - 10.00;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		accountBalance -=2;
		
	}
	
	
	
}
