package application;

import java.util.Scanner;
import entities.BankAccount;

public class BankAccountApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankAccount bankAccount;
		double value;

		System.out.println("Enter account number: ");
		int accountNumber = scan.nextInt();
		System.out.println("Enter account holder: ");
		scan.next();
		String holder = scan.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char anwser = scan.next().charAt(0);


		if (anwser == 'y' || anwser == 'Y') {
			System.out.print("Enter initial deposit value: ");
			value = scan.nextDouble();
			bankAccount = new BankAccount(accountNumber, holder, value);

		} else {
			bankAccount = new BankAccount(accountNumber, holder);
		}
		System.out.println("Account data: \n" + bankAccount);

		System.out.println("Enter a deposit value: ");
		value = scan.nextDouble();
		bankAccount.deposit(value);

		System.out.println("Update account data: \n " + bankAccount);

		System.out.println("Enter a withdraw value: ");
		value = scan.nextDouble();
		bankAccount.withdraw(value);

		System.out.println("Update account data: \n " + bankAccount);

		scan.close();

	}

}
