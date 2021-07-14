import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner typeScan = new Scanner(System.in);
		int funcionario, horas_trab;
		double valor_hora, salario;
		
		System.out.print("Digite o número do funcionário: ");
		funcionario = typeScan.nextInt();
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horas_trab = typeScan.nextInt();
		
		System.out.print("Digite o valor pago por hora trabalhada: ");
		valor_hora = typeScan.nextDouble();
		
		salario = (horas_trab * valor_hora);
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f",funcionario, salario);
		typeScan.close();
		
		
		

	}

}
