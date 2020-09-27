package com.amol.springboot.demo.bootapp;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import com.amol.springboot.demo.controller.OrderController;
import com.amol.springboot.demo.exception.TacoNotFoundException;
import com.amol.springboot.demo.model.TotalOrderRequest;
import com.amol.springboot.demo.model.TotalOrderResponse;

public class OrderControllerTest {
	
	OrderController orderController = new OrderController();

	//Test case without discount.
	@Test
	public void testNoDiscount() {
		final HashMap<String, Integer> noDiscount = new HashMap<>();
		noDiscount.put("Veggie Taco", 2);
		final TotalOrderRequest noDiscountRequest = new TotalOrderRequest("Not Discountable", noDiscount);
		final TotalOrderResponse noDiscountResponse = orderController.orderTotal(noDiscountRequest);
		assertEquals(noDiscountResponse.getTotal(), 5, 1e-15); //Delta (1e-15) for Margin of error
		
	}

	//Test case with applying discount.
	@Test
	public void testDiscount() {
		final HashMap<String, Integer> discount = new HashMap<>();
		discount.put("Beef Taco", 5);
		discount.put("Chicken Taco", 1);
		discount.put("Chorizo Taco", 2);
		discount.put("Veggie Taco", 1);
		final TotalOrderRequest discountRequest = new TotalOrderRequest("Discountable", discount);
		final TotalOrderResponse discountResponse = orderController.orderTotal(discountRequest);
		assertEquals(discountResponse.getTotal(), 22, 1e-15); //Delta (1e-15) for Margin of error
		
	}

	//Test cases for non existing Tacos
	@Test(expected = TacoNotFoundException.class)
	public void testNonExistingTacos() {
		final HashMap<String, Integer> nonExisting = new HashMap<>();
		nonExisting.put("Pizza", 3);
		final TotalOrderRequest nonExistingRequest = new TotalOrderRequest("nonexistentItemOrder", nonExisting);
		@SuppressWarnings("unused")
		final TotalOrderResponse nonExistingResponse = orderController.orderTotal(nonExistingRequest);
	}


}
