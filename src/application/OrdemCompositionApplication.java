package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enums.OrderStatus;

public class OrdemCompositionApplication {
	
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");		
		
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Email: ");
		scan.hasNextLine();
		String email = scan.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = formato.parse(scan.next());
		
		Client c1 = new Client(name, email, date);
		
		System.out.println("Enter order data");
		System.out.print("Status: ");
		String status = scan.next();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), c1);
		
		System.out.print("How many item to this order? ");
		int items = scan.nextInt();
		
		for (int i = 0; i < items; i++) {
			System.out.printf("Enter #%d item data: \n", i+1);
			System.out.print("Product name: ");
			scan.nextLine();
			String pName = scan.next();
			System.out.print("Product price");
			double price = scan.nextDouble();
			System.out.print("Quantity: ");
			scan.nextLine();
			int quantity = scan.nextInt();
			
			Product p = new Product(pName, price);
			OrdemItem oi = new OrdemItem(quantity, price, p);
			order.addOrdemItem(oi);
			

		}
		 
		System.out.print(order);
		
		
		
		scan.close();
	}

}
