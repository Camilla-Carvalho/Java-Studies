	package Application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = scan.nextDouble();
		
		double circ = calc.circumference(radius); // Objeto calc.	
		double vol = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f\n", circ);
		System.out.printf("Volume: %.2f\n", vol);
		System.out.printf("PI Value: %.2f\n", calc.PI);
		
		scan.close();
	}

	
}
