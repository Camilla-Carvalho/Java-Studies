import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner typeScan = new Scanner(System.in);
		int a, b, c, d, diferenca;
		
		a = typeScan.nextInt();
		b = typeScan.nextInt();
		c = typeScan.nextInt();
		d = typeScan.nextInt();
		
		diferenca = (a * b - c * d);
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		typeScan.close();
		
		
	}

}
