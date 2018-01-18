package com.delta.pipeline.DCPipeline.beans;

import javax.jms.JMSException;

import org.apache.camel.component.jms.JmsComponent;

import com.ibm.mq.jms.MQXAQueueConnectionFactory;

public class DcJmsComponent {

	
	
public JmsComponent ibmmqComponent() throws JMSException{
	    JmsComponent ibmmq = new JmsComponent();
	    MQXAQueueConnectionFactory factory = new MQXAQueueConnectionFactory();
	    factory.setQueueManager("DCC11INT"); 
	    factory.setHostName("dcci.delta.com");  
	    factory.setPort(1414);
	    factory.setTransportType(1);
	    ibmmq.setConnectionFactory(factory);
	    return ibmmq; 
}
}
