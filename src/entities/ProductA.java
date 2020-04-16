package entities;

public class ProductA {
	protected String name;
	protected double price;
	
	public ProductA(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String priceTag() {
		return (name + " $ " + price); 
	}

}
