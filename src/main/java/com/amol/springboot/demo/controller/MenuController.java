package com.amol.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amol.springboot.demo.data.TacoMenu;
import com.amol.springboot.demo.model.MenuResponse;

@RestController
public class MenuController {
	
	@RequestMapping("/menu")
	public MenuResponse menu() {
		return new MenuResponse(TacoMenu.tacomenu);
	}
}
