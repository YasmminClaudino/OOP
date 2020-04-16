package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class OutsourcedEmployeeApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Employee> empList = new ArrayList<>();

		System.out.print("enter the number of employees: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Empoyee #%d data: \n", i+1);
			System.out.print("Outsourced (y/n) ?");
			scan.nextLine();
			char c = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.next();

			System.out.print("hours: ");
			int hours = scan.nextInt();

			System.out.print("Value per hour: ");
			double vhours = scan.nextDouble();
			
			if (c == 'y') {
				System.out.print("Addtional charge: ");
				double addCharge = scan.nextDouble();

				Employee oEmp = new OutsourcedEmployee(name, hours, vhours, addCharge);
				empList.add(oEmp);

			} else {
				Employee emp = new Employee(name, hours, vhours);

				empList.add(emp);
			}

		}
		
		for (Employee e : empList) {
			System.out.println(e);
		}
		

		scan.close();
	}
}