package application;

import java.util.Scanner;
import entities.Triangle;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle triangleX = new Triangle();
		Triangle triangleY = new Triangle();
		double areaX, areaY;
		String max;
		
		System.out.println("Enter the mesuares of triangle X");
		triangleX.a = sc.nextDouble();
		triangleX.b = sc.nextDouble();
		triangleX.c = sc.nextDouble();
		
		System.out.println("Enter the mesuares of triangle Y");
		triangleY.a = sc.nextDouble();
		triangleY.b = sc.nextDouble();
		triangleY.c = sc.nextDouble();
		
		areaX = triangleX.area(triangleX.a, triangleX.b, triangleX.c);
		areaY = triangleY.area(triangleY.a, triangleY.b, triangleY.c);
		
		max = (areaX > areaY) ?  "TRIANGLE X" : "TRIANGLE Y";
		
		System.out.println("TRIANGLE X " + areaX);
		System.out.println("TRIANGLE Y " + areaY);
		System.out.println(max);
		
		sc.close();

	}

}
