import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner typeScan = new Scanner(System.in);
		
		double pi = 3.14159, raio, area;
		System.out.print("Digite o valor do raio: ");
		raio = typeScan.nextDouble();
		area = pi * Math.pow(raio, 2);
		
		typeScan.close();
		
		System.out.printf("A = %.4f", area);
		

	}

}
