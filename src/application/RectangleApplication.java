package application;

import java.util.Scanner;

import entities.Rectangle;


public class RectangleApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		System.out.println(rec);
		
		sc.close();

	}

}
