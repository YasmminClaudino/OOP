package entities;

public class Employee {
	private String name;
	protected double grossSalary;
	private double tax;
	protected int hours;
	protected double valuePerHour;
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
	
	public Employee(String name, int hours, double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentagem) {
		double increase = grossSalary * (percentagem / 100);
		grossSalary += increase;
	}
	
	public double payment() {
		return valuePerHour * hours;
		
	}

	public String toString() {
		return (name + " $" + String.format("%.2f", payment()));
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
