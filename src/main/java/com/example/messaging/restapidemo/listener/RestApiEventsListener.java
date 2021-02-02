package com.example.messaging.restapidemo.listener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;
import com.example.messaging.restapidemo.annotation.Log;

@Component
public class RestApiEventsListener  implements ApplicationListener<ApplicationEvent>{
	private static final String LATEST = "/currency/latest";
	
	

	@Log(printParamsValues=true)
	public void onApplicationEvent(ApplicationEvent event) {
		
	 }

}
