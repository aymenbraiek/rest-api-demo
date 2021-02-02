package com.example.messaging.restapidemo.exception;

import com.example.messaging.restapidemo.domain.CurrencyConversion;
import com.example.messaging.restapidemo.domain.Rate;

public class BadCodeRuntimeException  extends RuntimeException {

	private static final long serialVersionUID = -2411444965751028974L;
	private CurrencyConversion conversion;
	private Rate rate;
	
	public BadCodeRuntimeException(String message) {
		super(message);
	}	
	
	public BadCodeRuntimeException(String message,CurrencyConversion conversion) {
		super(message);
		this.conversion = conversion;
	}	
	
	public BadCodeRuntimeException(String message,Rate rate) {
		super(message);
		this.rate = rate;
	}	
	
	public CurrencyConversion getConversion(){
		return conversion;
	}
	
	public Rate getRate(){
		return rate;
	}
}
