package com.amol.springboot.demo.data;

import java.util.HashMap;

public class TacoMenu {
	public static final HashMap<String, Double> tacomenu = new HashMap<>();
	static { tacomenu.put("Veggie Taco", 2.50); tacomenu.put("Chicken Taco", 3.00);
		tacomenu.put("Beef Taco", 3.00); tacomenu.put("Chorizo Taco", 3.50); }
}
