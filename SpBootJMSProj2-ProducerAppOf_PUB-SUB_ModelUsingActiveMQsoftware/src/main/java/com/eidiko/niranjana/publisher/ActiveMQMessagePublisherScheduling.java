//package com.eidiko.niranjana.publisher;  //APPLICATION SUCCESSFULLY RUNNING
//
//import java.util.Date;
//
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.Session;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.core.MessageCreator;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//@Component
//public class ActiveMQMessagePublisherScheduling{
//
//	@Autowired
//	private JmsTemplate jmsTemplate;
//	
//	@Scheduled(cron="*/10 * * * * *") //Every 10sec msg will be send
//	public void publisherMessage() {
//		// 1 way : Using Annonymous inner class
//		jmsTemplate.send("Topic1", new MessageCreator() {
//			
//						@Override
//						public Message createMessage(Session ses) throws JMSException 
//						{
//							Message msg = ses.createTextMessage("Message Done From Sender at :"+new Date());
//							System.out.println("Message Sent..");
//							return msg;
//						}
//				});
////		//2nd way : Using Lambda style annonymous inner class
////		jmsTemplate.send("Topic1", ses->{
////			return ses.createTextMessage("Message Done From Sender at :"+new Date());
////		});
////	  //2nd way : Using Lambda style annonymous inner class(In a single line)
////		jmsTemplate.send("Topic1", ses-> ses.createTextMessage("Message Done From Sender at :"+new Date()));
//	}
//
//}
