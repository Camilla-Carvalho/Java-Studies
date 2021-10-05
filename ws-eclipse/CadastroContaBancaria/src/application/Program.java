package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountMovement;
import entities.ScreenArtifacts;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		AccountMovement account = new AccountMovement();	
		
		ScreenArtifacts artifact = new ScreenArtifacts();	
		System.out.print(artifact.header());

		System.out.print("\nEnter account holder: ");
		String accountHolder = scan.next().trim();	
		System.out.print("Enter account number: ");
		int accountNumber = scan.nextInt();		
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = scan.next().toLowerCase().charAt(0);
		
		AccountMovement user = new AccountMovement(accountHolder, accountNumber, option);
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			account.initialDeposit = scan.nextDouble();
			
		}else if (option == 'n') 
			account.initialDeposit = 0.00;
		

		System.out.printf("\nAccount Data:\n" + user.toString());
		System.out.print(account.initialDeposit);
		System.out.print("\n\nEnter a deposit value: ");
		double credit = scan.nextDouble();
		account.setCredit(credit);
		
		
		System.out.printf("Updated account data:\n" + user.toString());
		System.out.print(account.getCredit());
		
		System.out.print("\n\nEnter a withdraw value: ");
		double debit = scan.nextDouble();
		account.setDebit(debit);
		
		
		System.out.printf("Updated account data:\n" + user.toString());
		System.out.print(account.getDebit()  - account.initialDeposit);
		AccountMovement movement = new AccountMovement(credit, debit);
		
		
		scan.close();
		
	}
}
