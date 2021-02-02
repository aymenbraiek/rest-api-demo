package com.example.messaging.restapidemo.event;

import org.springframework.context.ApplicationEvent;

import com.example.messaging.restapidemo.domain.Rate;

public class CurrencyEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Rate rate;
	
	public CurrencyEvent(Object source,Rate rate) {
		super(source);
		this.rate = rate;
	}
	
	public Rate getRate(){
		return this.rate;
	}

}
