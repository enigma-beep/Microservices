package com.ericsson.microservices.Microservices;


public class InventorySuccessMessage {
	String responseCode;
	ItemDetails itemDetails;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public ItemDetails getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(ItemDetails itemDetails) {
		this.itemDetails = itemDetails;
	}
	@Override
	public String toString() {
		return "{\"responseCode\": \"" + responseCode + "\", \"itemDetails\": [" + itemDetails + "] }";
	}
	public InventorySuccessMessage(String responseCode, ItemDetails itemDetails) {
		super();
		this.responseCode = responseCode;
		this.itemDetails = itemDetails;
	}

}
