
import java.util.Scanner;

public class exercicio001 {

	public static void main(String[] args) {
		Scanner typeScan = new Scanner(System.in);
		int a, b, total;
		
		System.out.print("Digite o primeiro valor: ");
		a = typeScan.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = typeScan.nextInt();
		total = (a + b);
		typeScan.close();
		
		System.out.printf("SOMA = %d", total);

	}

}
