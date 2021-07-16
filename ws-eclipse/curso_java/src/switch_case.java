import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner typeScan = new Scanner(System.in);
		String dia;
		
		int x = typeScan.nextInt();

		switch (x) {

		case 1:
			dia = "Domingo_feira";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
		case 4:
			dia = "Quarta-feira";
		case 5:
			dia = "Quinta-feira";
		case 6:
			dia = "Sexta-feira";
		case 7:
			dia = "Sábado";
			
		System.out.printf("Dia da semana %s", dia);
		}
		
		
		typeScan.close();
	}

}
