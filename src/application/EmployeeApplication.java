package application;

import java.util.Scanner;
import entities.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		double percentagem;
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee data: " + emp);
		
		System.out.println("Which percentage to increase salaraty?");
		percentagem = sc.nextDouble();
		emp.increaseSalary(percentagem);
		
		System.out.println("Update employee data: " + emp);
		
		
		sc.close();
		
	}
}
