import java.util.Scanner;
import java.util.Locale;

public class demonstração_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		char resposta;
		
		do {
			
			System.out.print("Digite a temperatura em celcius: ");
			double c = scan.nextDouble();
			double f = ((9 * c) / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheit: %.2f\n", f);
			
			System.out.print("Deseja continuar?[S/N]:  ");
			resposta = scan.next().charAt(0);
			
		} while (resposta != 'n');
		
		System.out.print("\nFim!");

	}

}
