package application;

import entities.BankAccount;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bankAccount;
		SavingsAccount savingsAccount;
		BusinessAccount businessAccount;
		

		bankAccount = new BankAccount(101, "Yasmmin", 0.0);
		savingsAccount = new SavingsAccount(102, "João", 100, 0.02);
		
		//UPCASTING
		
		BankAccount ba = savingsAccount;
		BankAccount acc2 = new SavingsAccount(103, "Caio", 100, 0.01);
		
		//DOWNCASTING
		
		if(acc2 instanceof BusinessAccount) {
			BusinessAccount ba2 = (BusinessAccount) acc2;
			System.out.println(ba2);
			
		}
		
		if(acc2 instanceof SavingsAccount) {
			SavingsAccount ba2 = (SavingsAccount) acc2;
			ba2.updateBalance();
			System.out.println(ba2);
			
		}
		
	
	}

}
