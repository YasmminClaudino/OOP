package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat formatoB = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momentOrder;
	private OrderStatus os;
	
	private Client client;
	private List<OrdemItem> oiList = new ArrayList<>();
	
	public Order() {}
	
	public Order(Date momentOrder, OrderStatus os) {
		this.momentOrder = momentOrder;
		this.os = os;
	}

	public Order(Date momentOrder, OrderStatus os, Client client) {
		this.momentOrder = momentOrder;
		this.os = os;
		this.client = client;
	}

	public void addOrdemItem (OrdemItem oi) {
		oiList.add(oi);
	}
	
	public void removeOrdemItem (OrdemItem oi) {
		oiList.remove(oi);
	}

	public Date getMomentOrder() {
		return momentOrder;
	}

	public void setMomentOrder(Date momentOrder) {
		this.momentOrder = momentOrder;
	}

	public OrderStatus getOs() {
		return os;
	}

	public void setOs(OrderStatus os) {
		this.os = os;
	}
	
	
	
	public Client getClient() {
		return client;
	}

	public double total() {
		double total = 0;
		for(OrdemItem oi : oiList) {
			
			total+=oi.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Summary \n");
		sb.append("Order moment: \n");
		sb.append(formato.format(momentOrder) + "\n");
		sb.append("Order status: ");
		sb.append(os + "\n");
		sb.append("Client: \n");
		sb.append(client.getName() + " " + formatoB.format(client.getBirthDate()));
		sb.append(" - " + client.getEmail() + "\n");
		
		sb.append("Ordem items: \n");
		
		for(OrdemItem oi : oiList) {
			sb.append(oi.getProduct().getName() + ", ");
			sb.append("Quantity " + oi.getQuantity() + ", ");
			sb.append("Subtotal: " + oi.subTotal() + ", \n");
		
		}
		
		sb.append("total: " + total());
		
		
		
		
		
		return sb.toString();
	}

}
