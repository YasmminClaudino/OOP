package application;

import java.util.Scanner;
import entities.Product;

public class VetorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int number = scan.nextInt();
		
		Product[] vector = new Product[number];
		
		
		for (int i = 0; i < vector.length; i++) {
			String name = scan.next();
			double price = scan.nextDouble();
			
			Product prod = new Product(name, price);
			vector[i] = prod;
			
		}
		
		System.out.println(String.format("%.2f", avg(vector)));
		
		scan.close();

	}
	
	public static double avg(Product[] vector) {
		double soma = 0.0;
		
		for (int i = 0; i< vector.length; i++) {
			soma += vector[i].getPrice(); // you can access directly the value from object 
		}
		
		return soma/vector.length;
	}

}
