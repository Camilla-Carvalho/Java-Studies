
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle; 

public class Program {

	public static void main(String[] args) {
		double xA, xB, xC, yA, yB, yC;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		xA = scan.nextDouble();
		xB = scan.nextDouble();
		xC = scan.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = scan.nextDouble();
		yB = scan.nextDouble();
		yC = scan.nextDouble();
		
		
		double areaX = x.area(); // Colocar abre e fecha parenteses para indicar que estamos chamando o método.
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if (areaX > areaY)
			System.out.println("Larger area X");
		else
			System.out.println("Larger area Y");
		
		scan.close();

	}

}
