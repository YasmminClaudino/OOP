package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class OrderApplication {
	
	public static void main (String[] args) {
		
		Order od = new Order(1, new Date(), OrderStatus.PROCESSING);
		System.out.println(od);
		
	} 

}
