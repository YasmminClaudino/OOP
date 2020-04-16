package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.ProductA;
import entities.UsedProduct;

public class ProcutApp {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

		Scanner scan = new Scanner(System.in);

		List<ProductA> pList = new ArrayList<>();

		System.out.print("enter the number of products: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("product #%d data: \n", i + 1);
			System.out.print("Commom, impoter or used (c/i/u)?");
			scan.nextLine();
			char c = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.next();

			System.out.print("price: ");
			double price = scan.nextDouble();
			if (c == 'c') {
				ProductA pa = new ProductA(name, price);
				pList.add(pa);
			}
			if (c == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = scan.nextDouble();
				ProductA pi = new ImportedProduct(name, price, customsFee);
				pList.add(pi);

			}
			if (c == 'u') {
				System.out.print("Manafacture Date: ");
				Date date = formato.parse(scan.next());
				ProductA up = new UsedProduct(name, price, date);
				pList.add(up);
				

			}

		}
		
		for (ProductA a : pList) {
			System.out.println(a.priceTag());
		}
		scan.close();
	}

}