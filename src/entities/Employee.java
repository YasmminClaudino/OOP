package entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	private int id;
	
	public Employee(String name, double grossSalary, int id) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.id = id;
		
	}
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
		
	}
	
	

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentagem) {
		double increase = grossSalary * (percentagem / 100);
		grossSalary += increase;
	}

	public String toString() {
		return (name + " $" + String.format("%.2f", netSalary()));
	}

	public String getName() {
		return name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public int getId() {
		return id;
	}

}
