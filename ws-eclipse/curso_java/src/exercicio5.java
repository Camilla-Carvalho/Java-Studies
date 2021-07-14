import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner typeScan = new Scanner(System.in);
		// double idPeca1, idPeca2, qtd_pecas1, qtd_pecas2, valor_uni1, valor_uni2, total;
		int idPeca1, idPeca2, qtd_pecas1, qtd_pecas2;
		double valor_uni1, valor_uni2, total;
		
		idPeca1 = typeScan.nextInt();
		qtd_pecas1 = typeScan.nextInt();
		valor_uni1 = typeScan.nextDouble();
		
		idPeca2 = typeScan.nextInt();
		qtd_pecas2 = typeScan.nextInt();
		valor_uni2 = typeScan.nextDouble();
		
		/* total1 = qtd_pecas1 * valor_uni1;
		total2 = qtd_pecas2 * valor_uni2;
		
		pagamento = total1 + total2; */
		
		total = qtd_pecas1 * valor_uni1 + qtd_pecas2 * valor_uni2;
		
		System.out.printf("Valor a pagar: %.2f", total);
		typeScan.close();
	}

}
