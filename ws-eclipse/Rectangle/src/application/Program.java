package application;

import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter rectangle width and heigth: ");
		product.width = scan.nextDouble();
		product.height = scan.nextDouble();
		
		System.out.println(product.area());
		System.out.println(product.perimeter());
		System.out.println(product.diagonal());
		
		
		scan.close();
	}

}
