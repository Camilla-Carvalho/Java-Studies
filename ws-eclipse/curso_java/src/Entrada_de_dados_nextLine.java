import java.util.Scanner;

public class Entrada_de_dados_nextLine {

	public static void main(String[] args) {
		
		Scanner typeScan = new Scanner(System.in);
		
		String s1, s2, s3;
		s1 = typeScan.nextLine();  // next = lê apenas a próxima palavra 
		s2 = typeScan.nextLine();  // nextLine = lê a sentença toda até o final a quebra de linha (ou o enter).
		s3 = typeScan.nextLine();
		
		System.out.printf("DADOS DIGITADOS:\n %s\n %s\n %s", s1, s2, s3);
		
		typeScan.close();
		
		
	}
}
