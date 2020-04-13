package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class WorkerApplication {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat incomeFormato = new SimpleDateFormat("MM/yyyy"); 
		
		System.out.print("Enter departmentt's name: ");
		String departament = scan.next();
		
		System.out.print("Enter worker data \n: ");
		System.out.print("name: ");
		String name = scan.next();
		
		System.out.print("Level: ");
		String level = scan.next();
		
		
		System.out.print("Base salary: ");
		double baseSalary = scan.nextDouble();
		
		
		Worker worker = new Worker(name,WorkerLevel.valueOf(level), baseSalary, new Department(departament));
		
		System.out.print("how many contracts do this worker ");
		int contracts = scan.nextInt();
		
		for(int i = 0; i < contracts; i++) {
			
			System.out.printf("Enter contract #%d data: ", i+1);
			
			System.out.print("date(DD/MM/YYYY)");
			Date date = formato.parse(scan.next());
			
			System.out.print("Enter value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			System.out.print("hour to work ");
			int hours = scan.nextInt();
			
			HourContract contract = new HourContract(date,valuePerHour,hours);
			worker.addContract(contract);
			
		}
		
		
		System.out.print("Enter month and yeart to calculate income (MM/YYYY) ");
		Date incomeDate = incomeFormato.parse(scan.next());
	
		Calendar cal = Calendar.getInstance();
		cal.setTime(incomeDate);
		int year = cal.get(Calendar.YEAR);
		int month = 1 + cal.get(Calendar.MONTH);
		
		/*
		 * int month = Interger.parseInt(incomeDate.substring(0,2));
		 * int year = Interger.parseInt(incomeDate.substring(3));
		 * */
		
		System.out.println(worker);
		System.out.printf("Income for %d/%d: %.2f", month,year,worker.income(year, month));
		
		
		
		
		
		scan.close();
	}
}
