// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner typeScan = new Scanner(System.in);
		
		int value = typeScan.nextInt();
		
		if (value < 0)
			System.out.println("\nNEGATIVO ");
		
		else 
			System.out.println("\nNAO NEGATIVO ");

	}

}

// CORREÇÃO: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java