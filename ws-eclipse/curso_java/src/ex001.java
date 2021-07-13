import java.util.Locale;

public class ex001 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products\n\nComputer with price is %.2f \nOffice Desk with price is %.2f"
				+ "\n\nRecord: %d years old , code 5290 and gender: %s\n\nMeasue with eight decimal places: %.8f"
				+ "Rounded (three decial places): %.3f", price1, price2, age, gender, measure, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUs decimal point: %.3f", measure);
		
	}

}
