package util;

public class CurrencyConverter {
	
	public static double currency, quantity;
	
	
	public static double converter() {
		return currency * quantity;
	}
	public static double tax() {
		return (6 * converter()) / 100;
	}
	
	public static double totalValue() {
		return converter() + tax();
	}
}


	
	/* public String toString() {
		return "Amount to be paid in reais = "
				+ totalValue(); */	
	
	
		/*double converter = (CurrencyConverter.currency * CurrencyConverter.quantity);
		double tax = 6 * converter/ 100;*/

