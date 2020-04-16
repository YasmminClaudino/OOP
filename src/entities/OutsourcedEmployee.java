package entities;

public class OutsourcedEmployee extends Employee{
	private double addCharge;

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double addCharge) {
		super(name, hours, valuePerHour);
		this.addCharge = addCharge;
		
	}
	
	@Override
	public double payment() {
		//super.payment();
		return super.payment() + (addCharge * 1.1);
		
	}

	
	

}
