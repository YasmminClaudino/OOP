package entities;

public class ImportedProduct extends ProductA {
	private double customsFee;

	public ImportedProduct(String name, double price,double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
		
	}
	
	@Override
	public String priceTag() {
		return ( name + " $ " + totalPrice() + "(Customs fee: " + customsFee + ")");
	}
	
	public double totalPrice() {
		return price + customsFee;
		
	}
	

}
