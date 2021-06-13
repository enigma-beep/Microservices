package com.ericsson.microservices.Microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




//@RequestMapping("/executeOrder")
@RestController
public class OrderResources {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/executeOrder")
	public ResponseEntity<String> newOrder(@RequestBody Order orders){
		
		
		ResponseEntity<String> orderResponse = new ResponseEntity<String>(orderService.newOrder(orders),HttpStatus.OK);
		
		List<CartDetails> cartDetails = orders.getCartDetails();
		
		String validateResponse = orderService.validateAndExecuteOrder(cartDetails);
		
		if(validateResponse.equals(orderService.inventoryError.toString())) {
			return new ResponseEntity<String>(validateResponse,HttpStatus.OK);
		}
		else if(validateResponse.contains("false")) {
			return new ResponseEntity<String>(orderService.inventoryError.toString(),HttpStatus.OK);
		}
		else {
			return orderResponse;
		}
		
		
	}
	
	@PostMapping("/validateOrder")
	public ResponseEntity<String> validateOrder(@RequestBody List<Inventory> inventories){
		
		return new ResponseEntity<String>(orderService.validateOrder(inventories),HttpStatus.OK);
	}
	
	@GetMapping("/getOrders")
	private ResponseEntity<List<Order>> getAllOrders(){
		return new ResponseEntity<List<Order>>(orderService.getAllOrders(),HttpStatus.OK);
	} 

}
