package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountHolder;

public class Account {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		AccountHolder user = new AccountHolder();
		
		System.out.print("Enter with client: ");
		user.setClient(scan.nextLine()); 	
		
		
		System.out.print("Informe o saldo: ");
		user.setSaldo(scan.nextDouble());
		
		System.out.println("Cliente = " + user.getClient());
		System.out.println("Saldo = " + user.getSaldo());
		
		
		// double saldo = scan.nextDouble();
		
		
	}	
}
