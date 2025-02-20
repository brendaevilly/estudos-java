package util;

public class CurrencyConverter {

	public static double amountToBePaidInReais (double dollarPrice, double amountInDollars) {
		double iof = dollarPrice * amountInDollars;
		return iof += iof * 6 / 100;
	}
}
