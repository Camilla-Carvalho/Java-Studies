package application;

import java.util.Locale;
import java.util.Scanner;
import entities.tenantData;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented: ");
		int quantity = scan.nextInt();
		tenantData[] vect = new tenantData[quantity];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("\nRent #%d\n", i+1);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("E-mail: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int room = scan.nextInt();
			vect[i] = new tenantData(name, email, room);
			}
		
		System.out.println("Busy Rooms: ");
		
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i].getRoom());
			System.out.print(": " + vect[i].getName());
			System.out.println(", " + vect[i].getEmail());
			
		}
		
		
		scan.close();
	}

}
