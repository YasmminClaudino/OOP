package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Execptions.DomainException;
import entities.Reservation;

public class ReservationApp {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);

		try{
			System.out.println("Room number: ");
			int roomNumber = scan.nextInt();
			System.out.println("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(scan.next());
			System.out.println("Check-out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(scan.next());
	
	
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Resevation info \n" + reservation);
	
			System.out.println("Update reservation dates: ");
			System.out.println("update check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(scan.next());
			System.out.println("update check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(scan.next());
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Update resavation info \n" + reservation);
		
		} catch(ParseException e){
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println("Error in reservation " + e);
			
		} catch(RuntimeException e) {
			System.out.print(e);
		}
		scan.close();

	}

}
