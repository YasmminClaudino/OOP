package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class EmployeeListApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee employee;
		List<Employee> list = new ArrayList<>();
		int number;
		String name;
		Double salary, percent;

		System.out.println("How many employess will be registered? ");
		number = scan.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.printf("Employee #%d: \n", i + 1);
			System.out.print("Id: ");
			scan.nextLine();
			int id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			name = scan.nextLine();
			System.out.print("Salary: ");
			// scan.nextLine();
			salary = scan.nextDouble();
			employee = new Employee(name, salary, id);
			list.add(employee);
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		scan.nextLine();
		int id = scan.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp != null) {
			System.out.print("Enter the employee id that will have salary increase : ");
			percent = scan.nextDouble();
			emp.increaseSalary(percent);

		} else {
			System.out.println("This id does not exist!");
		}
		// double getSalary = list.stream().filter(x -> x == id).filter;

		// int valu = employees.stream().filter(x -> x.equals(id));
		print(list);
		//System.out.println(list.get(1));
		scan.close();

	}

	public static <T> void print(List<T> list) {
		for (T value : list) {
			System.out.println(value);
		}
	}

}
