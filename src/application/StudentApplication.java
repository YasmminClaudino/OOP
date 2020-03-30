package application;

import java.util.Scanner;
import entities.Student;
public class StudentApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		st.name = sc.nextLine();
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();
		
		System.out.println(st);
		
		
		sc.close();

	}

}
