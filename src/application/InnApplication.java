package application;

import java.util.Scanner;
import entities.InnInfo;

public class InnApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int totalRooms = 10;
		InnInfo[] innInfo = new InnInfo[totalRooms];
		
		System.out.println("How many rooms will be rented? ");
		int rooms = scan.nextInt();
		
		for (int i = 0; i < rooms; i++) {
			System.out.printf("Rent #%d\n", i+1);
			System.out.print("Name:" );
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Email:" );
			String email = scan.next();
			System.out.print("Room:" );
			//scan.nextLine();
			int room = scan.nextInt();
			InnInfo student = new InnInfo(name, email);
			innInfo[room] = student; 
		}
		
		printInfo(innInfo);
		
		scan.close();

	}
	
	public static void printInfo(InnInfo[] innInfo) {
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < innInfo.length; i++) {
			if (innInfo[i] != null) {
				System.out.printf("%d: %s, %s \n", i,
						innInfo[i].getName(), innInfo[i].getEmail());
				}
			
		}
	}

}
