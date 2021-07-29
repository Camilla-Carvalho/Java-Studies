package entities;

public class Product { // The project class is a class of type Object
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
		
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
		//Att. to class || Arguments
	}
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $ "
			+ String.format("%.2f", totalValueInStock())
			+ lin();
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String header() {
		return "============================================================\n"
				+ "                       C A D A S T R O                       "
				+ "\n============================================================";
	}
	
	public String lin() {
		return "\n============================================================";
		
		
	}
}

