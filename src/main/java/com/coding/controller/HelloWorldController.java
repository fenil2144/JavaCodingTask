package com.coding.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Rest Controller class for defining Api's
 * @author Fenil
 *
 */
@RestController
public class HelloWorldController {

	@RequestMapping({ "/adminHome" })
	public String adminHome() {
		return "Hello Admin";
	}
	
	@RequestMapping({ "/commonHome" })
	public String coomonHome() {
		return "Hello All";
	}

}