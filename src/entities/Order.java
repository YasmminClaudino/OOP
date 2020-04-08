package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private int id;
	private Date momentOrder;
	private OrderStatus os;
	
	public Order() {}

	public Order(int id, Date momentOrder, OrderStatus os) {
		this.id = id;
		this.momentOrder = momentOrder;
		this.os = os;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Order [id=" + id + ", momentOrder=" + momentOrder + ", os=" + os + "]";
	}

	
	

}
