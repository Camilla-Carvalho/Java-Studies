package application;

import java.util.Scanner;
import entities.Person;


public class herancaTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		
		
		System.out.print("Enter with name: ");
		String nome = scan.nextLine();
		System.out.print("Enter with age: ");
		int idade = scan.nextInt();
		
		Person atributo = new Person(nome, idade);
	
		System.out.printf(atributo.toString());
	}
}
