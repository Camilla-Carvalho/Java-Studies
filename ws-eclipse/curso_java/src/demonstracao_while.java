import java.util.Scanner;

public class demonstracao_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner typeScan = new Scanner(System.in);
		
		int num = typeScan.nextInt();
		int soma = 0;
		
		while (num != 0) {
			
			soma += num;
			num = typeScan.nextInt();
			
			
		}
		System.out.printf("Você digitou %d", soma);
		
		typeScan.close();
		
	}

}
