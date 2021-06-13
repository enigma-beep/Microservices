package com.ericsson.microservices.Microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/executeOrder")
public class OrderResources {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/new")
	public ResponseEntity<String> newOrder(@RequestBody Order orders){
		
		return new ResponseEntity<String>(orderService.newOrder(orders),HttpStatus.OK);
	}
	
	@PostMapping("/validateOrder")
	public ResponseEntity<String> validateOrder(@RequestBody List<Inventory> inventories){
		
		return new ResponseEntity<String>(orderService.validateOrder(inventories),HttpStatus.OK);
	}
	
	@GetMapping("/getall")
	private ResponseEntity<List<Order>> getAllOrders(){
		return new ResponseEntity<List<Order>>(orderService.getAllOrders(),HttpStatus.OK);
	} 

}
