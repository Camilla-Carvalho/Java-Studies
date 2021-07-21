import java.util.Scanner;

public class demonstração_chamadaDeFunções {

	public static void main(String[] args) { // Bloco de código de uma classe; 

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		 int higher = max(a, b, c);
		 showResult(higher);
		
		scan.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z)
			aux = x;
		else if (y > z)
			aux = y;
		else
			aux = z;
		return aux;
	}
	public static void showResult(int value) {
		System.out.printf("Higher = %d ", value);
	}
	
}

/* if (a > b && a > c)
System.out.printf("Higher %d", a);
else if(b > c)
System.out.printf("Higher %d", b);
else
System.out.printf("Higher %d", c); */
