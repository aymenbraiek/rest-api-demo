package com.example.messaging.restapidemo.event;

import org.springframework.context.ApplicationEvent;

import com.example.messaging.restapidemo.domain.CurrencyConversion;

public class CurrencyConversionEvent  extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CurrencyConversion conversion;
	private String message;
	
	 
	 public CurrencyConversionEvent(Object source, CurrencyConversion conversion) {
		super(source);
		// TODO Auto-generated constructor stub
		this.conversion = conversion;
	}


	public CurrencyConversionEvent(Object source, String message,CurrencyConversion conversion) {
		super(source);
		this.conversion = conversion;
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public CurrencyConversion getConversion() {
		return conversion;
	}


	public void setConversion(CurrencyConversion conversion) {
		this.conversion = conversion;
	}
	 
	 

	

}
