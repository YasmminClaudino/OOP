package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductA {
	private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return (name + " (USED) $ " + price + "(Manufacture date: " + formato.format(manufactureDate) + ")");
	}

}
