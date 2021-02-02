package com.example.messaging.restapidemo.listener;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.example.messaging.restapidemo.annotation.Log;
import com.example.messaging.restapidemo.event.CurrencyConversionEvent;
import com.example.messaging.restapidemo.event.CurrencyEvent;

@Component
public class RestAppEventListener {
	
	//@EventListener(condition = "#springApp.args.length > 1")
	//@EventListener
	//@EventListener({CurrencyEvent.class,
		 //CurrencyConversionEvent.class})
	@EventListener
	@Order(Ordered.HIGHEST_PRECEDENCE)
	@Async
	@Log(printParamsValues=true)
	public void restAppHandler(SpringApplicationEvent springApp){
	 }
}
