import java.util.Locale;
import java.util.Scanner;

public class exemplo_terreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner typeScan = new Scanner(System.in);
		
		double largura = typeScan.nextDouble();
		double comprimento = typeScan.nextDouble();
		double metroquadrado = typeScan.nextDouble(); 
		
		double area = largura * comprimento;
		double preco = area * metroquadrado;
		
		System.out.printf("Area = %.2f", area);
		System.out.printf("Area = %.2f", preco);
		
		typeScan.close();

	}
}
