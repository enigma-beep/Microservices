package com.ericsson.microservices.Microservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;



@Service
public class OrderService {

	List<Order> order = new ArrayList<Order>(Arrays.asList(new Order("abhigyan","address 1",5000,
																Arrays.asList(new CartDetails("ITEM 11",5)))));
	
	MessageSuccess messageSuccess= new MessageSuccess("success", new Random().nextInt(99999));
	MessageError paymentError= new MessageError("ERROR", "PAYMENT_NOT_VALID_ERROR");
	MessageError cartError= new MessageError("ERROR", "CART_EMTPY_ERROR");
	MessageError addressError= new MessageError("ERROR", "NO_SHIPPING_ADDRESS_ERROR");
	MessageError inventoryError= new MessageError("ERROR", "ITEMS_NOT_IN_INVENTORY");
	MessageError internalError= new MessageError("ERROR", "INTERNAL_ERROR");
	
	InventorySuccessMessage inventoryMessageSuccess;
	ItemDetails itemDetails;
	
	List<Inventory> inventory= new ArrayList<Inventory>(Arrays.asList(new Inventory("ITEM1",10), new Inventory("ITEM2",10)));
	
	
	public String newOrder(Order orders){
		
		
		if(orders.getPaymentAmount()<0) {
			return paymentError.toString(); 
		}
		else if(orders.getShippingAddress()=="") {
			return addressError.toString();
		}
		else if(orders.getCartDetails().isEmpty()) {
			return cartError.toString();
		}
		else {
			order.add(orders);
			return messageSuccess.toString();
		}
	}
	
	public List<Order> getAllOrders(){
		return order;
	}
	
	
	public String validateOrder(Inventory inventories) {
		if(inventories.getItemCode().equals(inventory.get(0).getItemCode())) {
			if(inventories.getQuantity()<=inventory.get(0).getQuantity()) {
				
				itemDetails = new ItemDetails(inventories.getItemCode(), inventories.getQuantity(),true);
				inventoryMessageSuccess = new InventorySuccessMessage("success",itemDetails);
				
				return inventoryMessageSuccess.toString();
			}
			else {
				itemDetails = new ItemDetails(inventories.getItemCode(), inventories.getQuantity(),false);
				inventoryMessageSuccess = new InventorySuccessMessage("success",itemDetails);
				
				return inventoryMessageSuccess.toString();
			}
		}
		else if(inventories.getItemCode().equals(inventory.get(1).getItemCode())) {
			if(inventories.getQuantity()<=inventory.get(1).getQuantity()) {
				itemDetails = new ItemDetails(inventories.getItemCode(), inventories.getQuantity(),true);
				inventoryMessageSuccess = new InventorySuccessMessage("success",itemDetails);
				
				return inventoryMessageSuccess.toString();
			}
			else {
				itemDetails = new ItemDetails(inventories.getItemCode(), inventories.getQuantity(),false);
				inventoryMessageSuccess = new InventorySuccessMessage("success",itemDetails);
				
				return inventoryMessageSuccess.toString();
			}
		}
		else {
			return internalError.toString();
		}
	}
	
}
