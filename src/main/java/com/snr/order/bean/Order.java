package com.snr.order.bean;

public class Order {

	private int orderId;
	private String orderStatus;
	private double totalPrice;
	
	
	
	public Order(int orderId, String orderStatus, double totalPrice) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.totalPrice = totalPrice;
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
	
}
