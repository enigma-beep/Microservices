package com.ericsson.microservices.Microservices;

public class ItemDetails {
	String itemCode;
	Integer quantity;
	Boolean available;
	@Override
	public String toString() {
		return "{\"itemCode\": \"" + itemCode + "\", \"quantity\": " + quantity + ", \"available\": " + available + " }";
	}
	public ItemDetails(String itemCode, Integer quantity, Boolean available) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.available = available;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
}
