package com.amol.springboot.demo.model;

import java.util.HashMap;
public class TotalOrderRequest {
	private final String customerid;
	private final HashMap<String, Integer> foodOrder;
	
	public TotalOrderRequest(String customerId, HashMap<String, Integer> foodOrder) {
		this.customerid = customerId;
		this.foodOrder = foodOrder;
	}

	public String getcustomerId() {
		return customerid;
	}

	public HashMap<String, Integer> getFoodOrder() {
		return foodOrder;
	}
}
