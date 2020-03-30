package application;

import entities.Product;
import java.util.Scanner;
public class ProductApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stock;
		Product product = new Product();
		System.out.println("Insert the product data");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: " );
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product Data: " + product);
		
		System.out.print("Enter the numer of products to be added in stock: ");
		stock = sc.nextInt();
		product.addProductsQuantity(stock);
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the numer of products to be removed in stock: ");
		stock = sc.nextInt();
		product.removeProducts(stock);
		System.out.println("Updated data: " + product);
		
		sc.close();
		
	}

}
