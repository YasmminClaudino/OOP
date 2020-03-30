package application;

import java.util.Scanner;
import entities.CurrencyConverter;

public class CurrencyConverterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = scan.nextDouble();
		CurrencyConverter.dollarPrice = dollarPrice;
		
		System.out.print("How many dollars will be bought? ");
		double dollar = scan.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverter.amountToPaid(dollar)));
		scan.close();

	}

}
