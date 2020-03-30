package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06; 
	public static double dollarPrice;
	
	public static double amountToPaid(double dollar) {
		double currency = dollarPrice * dollar;
		currency = currency + currency * IOF;
		return currency;
	}

}
