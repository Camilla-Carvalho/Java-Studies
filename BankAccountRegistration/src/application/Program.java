package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;

		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter account holder: ");
		String holder = scan.next(); 
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = scan.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}else 
			account = new Account(number, holder);
		
		
		System.out.print("\nAccount Data: ");	
		System.out.print(account.toString());


		System.out.print("\nEnter a deposit value: ");
		double depositValue = scan.nextDouble();
		account.deposit(depositValue); // account deposit
		System.out.print("Updated account data:\n");
		System.out.print(account.toString());
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = scan.nextDouble();
		account.withdraw(withdrawValue);
		System.out.print("Updated account data: ");
		System.out.print(account.toString());
		
		scan.close();

	}

}
