import java.util.Locale;
import java.util.Scanner;

public class Estrutura_condicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner typeScan = new Scanner(System.in);
		
			double a, b, total;
			int option;
			
			System.out.print("Digite o primeiro valor: ");
			a = typeScan.nextDouble();
			System.out.print("Digite o segundo valor:  ");
			b = typeScan.nextDouble();
			
			System.out.println("\n[ 1 ]SOMA \n[ 2 ]SUBTRACAO \n[ 3 ]DIVISAO \n[ 4 ]MULTIPLICACAO\n\nDigite uma opção: ");
			option = typeScan.nextInt();
			
			if (option == 1){
				
				total = (a + b);
				System.out.printf("O resultado de %.1f + %.1f = %.1f", a, b, total);
			}
			else if (option == 2) {
				total = (a - b);
				System.out.printf("O resultado de %.1f - %.1f = %.1f", a, b, total);
			}
			else if (option == 3) {
				total = (a / b);
				System.out.printf("O resultado de %.1f / %.1f = %.1f", a, b, total);
			}
			else if (option == 4) {
				total = (a * b);
				System.out.printf("O resultado de %.1f * %.1f = %.1f", a, b, total);
			}
			else {
				System.out.println("OPÇÃO INVÁLIDA! POR FAVOR EXECUTE O PROGRAMA NOVAMENTE!");
			}
			
		typeScan.close();
	}

}
