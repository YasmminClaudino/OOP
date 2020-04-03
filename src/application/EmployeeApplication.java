package application;

import java.util.Scanner;
import entities.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double percentagem;
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		Employee emp = new Employee(name, grossSalary, tax);
	
		
		System.out.println("Employee data: " + emp);
		
		System.out.println("Which percentage to increase salaraty?");
		percentagem = sc.nextDouble();
		emp.increaseSalary(percentagem);
		
		System.out.println("Update employee data: " + emp);
		
		
		sc.close();
		
	}
}
