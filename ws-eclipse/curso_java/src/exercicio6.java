import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner typeScan = new Scanner(System.in);
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		a = typeScan.nextDouble();
		b = typeScan.nextDouble();
		c = typeScan.nextDouble();
		
		triangulo = (a * c)/ 2;
		circulo = pi * Math.pow(c, 2);
		trapezio = ((a + b) * c)/ 2;
		quadrado = Math.pow(b, 2);
		retangulo = (a * b);
		
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f",
				triangulo, circulo, trapezio, quadrado, retangulo);
		
		typeScan.close();
	}

}

// CORREÇÃO: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
