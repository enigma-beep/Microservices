package com.ericsson.microservices.Microservices;

public class MessageError {
	
	String responseStatus;
	String errorCode;
	@Override
	public String toString() {
		return "{\"responseStatus\": \"" + responseStatus + "\", \"errorCode\": \"" + errorCode + "\"}";
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public MessageError(String responseStatus, String errorCode) {
		super();
		this.responseStatus = responseStatus;
		this.errorCode = errorCode;
	}
	

}
