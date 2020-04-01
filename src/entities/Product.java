package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public double totalValueInStock() {
		return (price * quantity);
	}

	public void addProductsQuantity(int value) {
		quantity += value;
	}

	public void removeProducts(int value) {
		quantity -= value;
	}

	public String toString() {
		return ("Name: " + name + " Price: " + String.format("%.2f", price) + " Quantity in Stock: " + quantity
				+ " Total amount: " + String.format("%.2f", totalValueInStock()));

	}

}
