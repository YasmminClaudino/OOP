package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return (price * quantity);
	}
	
	public void addProductsQuantity (int value) {
		quantity+=value;
	}	
	
	public void removeProducts(int value) {
		quantity-=value;
	}
	
	public String toString() {
		return ("Name: " + name + " Price: " + String.format("%.2f", price) + " Quantity in Stock: " + 
				quantity + " Total amount: " + String.format("%.2f", totalValueInStock()) );
		
	}
	
}
