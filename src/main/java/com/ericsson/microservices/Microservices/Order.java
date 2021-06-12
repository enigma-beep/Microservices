package com.ericsson.microservices.Microservices;

import java.util.List;

public class Order {
	String clientName, shippingAddress;
	int paymentAmount;
	List<CartDetails> cartDetails;

	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public Order(String clientName, String shippingAddress, int paymentAmount, List<CartDetails> cartDetails) {
		super();
		this.clientName = clientName;
		this.shippingAddress = shippingAddress;
		this.paymentAmount = paymentAmount;
		this.cartDetails = cartDetails;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	@Override
	public String toString() {
		return "Order [clientName=" + clientName + ", shippingAddress=" + shippingAddress + ", paymentAmount="
				+ paymentAmount + ", cartDetails=" + cartDetails + "]";
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<CartDetails> getCartDetails() {
		return cartDetails;
	}
	public void setCartDetails(List<CartDetails> cartDetails) {
		this.cartDetails = cartDetails;
	}
}
