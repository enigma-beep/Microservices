package com.ericsson.microservices.Microservices;

public class MessageSuccess {
	
	String responseStatus;
	Integer orderId;
	@Override
	public String toString() {
		return "{\"responseStatus\": \"" + responseStatus + "\", \"orderId\": " + orderId + " }";
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public MessageSuccess(String responseStatus, Integer orderId) {
		super();
		this.responseStatus = responseStatus;
		this.orderId = orderId;
	}
	

}
