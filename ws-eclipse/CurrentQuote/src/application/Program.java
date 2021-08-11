package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		

		System.out.print("What is the Dolar price: ");
		CurrencyConverter.currency = scan.nextDouble();
		System.out.print("How money dollars will be bought? ");
		CurrencyConverter.quantity = scan.nextDouble();
		System.out.print(" ");
		
		System.out.printf("Amond to be paid in reais = %.2f", CurrencyConverter.totalValue());
		
	}
}
