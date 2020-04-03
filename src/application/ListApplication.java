package application;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class ListApplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		String value;
		
		while (true) {
			value = scan.next();
			if (!value.equals("0")) {
				list.add(value);
			}else {
				break;
			}

		}
		
		list.add(0, "Maria"); //posição, valor
		
		/*
		for (Integer v : list) {
			System.out.println(v);
		}
		*/
		print(list);
		list.removeIf(v -> v == "Teste");
		System.out.println("");
		print(list);
		
		System.out.println("Print list index of: " + list.indexOf("yas")); //return -1 if value is not found
		
		List<String> result =  list.stream().filter(v -> v.equals("Yasmmin")).collect(Collectors.toList());
		
		print(result);
		

		scan.close();

	}
	
	public static <T> List<T> print(List<T> list) {
		for (T v : list) {
			System.out.println(v);
		}
		return list;
	}
	

}
