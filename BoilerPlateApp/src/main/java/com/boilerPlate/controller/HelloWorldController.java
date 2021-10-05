/**
 * 
 */
package com.boilerPlate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ankit
 *
 */
@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/welcome")
	public String print() {
		return "Welcome to Spring boot app! Webhook Trigger Enabled";
	}
}
