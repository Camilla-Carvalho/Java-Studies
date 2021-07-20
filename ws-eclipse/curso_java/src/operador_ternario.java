
public class operador_ternario {

	public static void main(String[] args) {
		// EXPRESSÃO CONDICIONAL TERNARIA
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05; // Adorei! 
		
		
		/* if (preco > 20)
			desconto = preco * 0.1;
		else
			desconto = preco * 0.5; */

		System.out.println(desconto); 
	}

}
