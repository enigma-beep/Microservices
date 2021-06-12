package com.ericsson.microservices.Microservices;


public class CartDetails {
	String itemCode;
	Integer quantity;
	@Override
	public String toString() {
		return "CartDetails [itemCode=" + itemCode + ", quantity=" + quantity + "]";
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
	public CartDetails(String itemCode, Integer quantity) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
	}
}
