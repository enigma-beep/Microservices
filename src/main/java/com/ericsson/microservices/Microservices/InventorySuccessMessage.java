package com.ericsson.microservices.Microservices;

import java.util.List;

public class InventorySuccessMessage {
	String responseCode;
	List<ItemDetails> itemDetails;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public List<ItemDetails> getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(List<ItemDetails> itemDetails) {
		this.itemDetails = itemDetails;
	}
	@Override
	public String toString() {
		return "{\"responseCode\": \"" + responseCode + "\", \"itemDetails\": [" + itemDetails + "] }";
	}
	public InventorySuccessMessage(String responseCode, List<ItemDetails> itemDetails) {
		super();
		this.responseCode = responseCode;
		this.itemDetails = itemDetails;
	}

}
