package com.eidiko.niranjana.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class JmsMessageReceiver {

	@JmsListener(destination="Topic1")
	public void readMessageFromSender(String text)
	{
		System.out.println("Received msg from Publisher is::"+text);
		
	}
}
