package com.example.messaging.restapidemo.listener;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import com.example.messaging.restapidemo.annotation.Log;
import com.example.messaging.restapidemo.event.CurrencyEvent;

@Component
public class RateEventListener {
	 @TransactionalEventListener
	 @Log(printParamsValues=true,callMethodWithNoParamsToString="getRate")
	 public void processEvent(CurrencyEvent event){
		 
	 }
}
