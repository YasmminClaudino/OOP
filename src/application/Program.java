package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter the mesuares of triangle X");
		double xa = scan.nextDouble();
		double xb = scan.nextDouble();
		double xc = scan.nextDouble();
		
		System.out.println("Enter the mesuares of triangle Y");
		double ya = scan.nextDouble();
		double yb = scan.nextDouble();
		double yc = scan.nextDouble();
		
		double areax, areay;
		String max;
		
		areax = area(xa,xb,xc);
		areay = area(ya,yb,yc);
		
		max = (areax > areay ? "TRIANGLE X" : "TRIANGLE Y");
		
		System.out.println("TRIANGLE X " + areax);
		System.out.println("TRIANGLE Y " + areay);
		System.out.println(max);
		
		scan.close();		
}
	
	public static double area(double a, double b, double c) {
		double p, area;
		
		p = (a + b + c)/2.0;
		area = Math.sqrt((p * (p -a) * (p -b) * (p-c)));
		return area;
		
		
	}

}
