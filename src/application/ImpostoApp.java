package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class ImpostoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Contribuinte> cList = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Individual or company> (i/c): ");
			char c = scan.next().charAt(0);

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Anual income: ");
			double annualIncome = scan.nextDouble();

			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double he = scan.nextDouble();
				cList.add(new PessoaFisica(name, annualIncome, he));

			} else if (c == 'c') {
				System.out.print("Number of employees: ");
				int nEmployees = scan.nextInt();
				cList.add(new PessoaJuridica(name,annualIncome, nEmployees));
			}
		}
		
		getTaxPayersInfo(cList);

		scan.close();

	}
	
	public static void getTaxPayersInfo(List<Contribuinte> cList) {
		double tax = 0;
		System.out.println("Taxes paid:");
		for(Contribuinte c : cList) {
			System.out.println(c);
			tax += c.imposto();
			
		}
		System.out.println("TOTAL TAXES: $" +String.format("%.2f", tax));
	}

}
