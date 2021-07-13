import java.util.Locale;

public class Funções_matematicas_java {

	public static void main(String[] args) {
		
		double x = 3.0, y = 3.0, z = -5.0, a, b, c;
		
		Locale.setDefault(Locale.US);
		
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.printf("Raiz quadrada de %.2f = %.2f\nRaiz quadrada de %.2f = %.2f\nRaiz quadrada de 25 é %.2f", x, a, y, b, c);
		
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		System.out.printf("\n\n%.2f elevado a %.2f = %.2f", x, y, a);
		System.out.printf("\n%.2f elevado ao quadrado = %.2f", x, b);
		System.out.printf("\n5 elevado ao quadrado = ", c);
		
		
		a = Math.abs(y); // abs = valor absoluto... Tira o sinal de negativo caso exista.
		b = Math.abs(z);
		
		System.out.printf("\nValor absoluto de %.2f = %.2f\nValor absoluto de %.2f = %.2f", y, a, z, b);
		
	}

}
