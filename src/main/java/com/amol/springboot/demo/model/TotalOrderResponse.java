package com.amol.springboot.demo.model;
public class TotalOrderResponse {
	private final String orderId;
	private final double total;
	
	public TotalOrderResponse(String ID, double total) {
		this.orderId = ID;
		this.total = total;
	}
	public String getOrderID() {
		return orderId;
	}

	public double getTotal() {
		return total;
	}
}
