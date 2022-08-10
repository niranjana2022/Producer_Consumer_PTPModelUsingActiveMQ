package com.eidiko.niranjana.runner;

import java.util.Date;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
@Component
public class ActiveMQMessagePublisherRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Override
	public void run(String... args) throws Exception {
		// 1 way : Using Annonymous inner class
		jmsTemplate.send("Topic1", new MessageCreator() {
			
						@Override
						public Message createMessage(Session ses) throws JMSException 
						{
							Message msg = ses.createTextMessage("Message Done From Sender at :"+new Date());
							System.out.println("Message Sent by Publisher...");
							return msg;
						}
				});
//		//2nd way : Using Lambda style annonymous inner class
//		jmsTemplate.send("Topic1", ses->{
//			return ses.createTextMessage("Message Done From Sender at :"+new Date());
//		});
//	  //2nd way : Using Lambda style annonymous inner class(In a single line)
//		jmsTemplate.send("Topic1", ses-> ses.createTextMessage("Message Done From Sender at :"+new Date()));
	}

}
