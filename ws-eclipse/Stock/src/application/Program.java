package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		// Data reading
		Product product = new Product();
		
		System.out.print(product.header());
		System.out.println("\nEnter product data: ");
		System.out.print("Name: ");
		product.name = scan.nextLine(); // In this line we are storing a variable name inside the object product
		System.out.print("Price: ");
		product.price = scan.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scan.nextInt();
		
		System.out.print("Product data: " + product.toString());
		product.lin();
		System.out.print("\nEnter the numbers of products to be added in stock: ");
		int quantity = scan.nextInt();
		product.addProducts(quantity); // quantity update within the project object
		
		System.out.print("Updated Data: " + product);
		
		System.out.print("\nEnter the numbers of products to be removed from in stock: ");
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated Data: " + product);
		
		scan.close();
	}

}
