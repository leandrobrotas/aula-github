package course.entities;

public class CurrencyConverter {

	public static double IOF = 0.06;

	public static double dollarInReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
}
