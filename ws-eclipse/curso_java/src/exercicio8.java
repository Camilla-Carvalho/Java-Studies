import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner typeScan = new Scanner(System.in);
		
		
		System.out.print("Digite um número inteiro: ");
		double num = typeScan.nextInt();
		
		if(num % 2 == 0) 
			System.out.println("PAR");
		else 
			System.out.println("IMPAR");			
			
	}
	
}

// CORREÇÃO: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
