package com.eidiko.niranjana.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class JmsMessageConsumer {

	@JmsListener(destination="TestMqProj1")
	public void readMessageFromSender(String text)
	{
		System.out.println("Received msg from sender is::"+text);
		
	}
}
