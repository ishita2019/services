package com.delta.pipeline.DCPipeline.camel.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

import org.springframework.stereotype.Component;

import com.delta.pipeline.DCPipeline.beans.DcJmsComponent;

@Component
public class CamelRoutesBuilder  {
	
	CamelContext camelContext = new DefaultCamelContext();

 public void camelRouteBuilders() throws Exception {
	 
	 final DcJmsComponent dcJmsComponent=new DcJmsComponent();
		 
		// from("jetty:localhost:9000/offers").to("direct:getOffers").end();
		// from("timer:mytimer?period={{timer.period}}")
        // .setBody(simple("{{greeting.word}}, this is Camel running in Spring Boot!"))
        // .to("log:out");
		// from("file://foo/bar") .bean(MQCamelListeners.class);

camelContext.addComponent("ibmmq", dcJmsComponent.ibmmqComponent()); 

		 camelContext.addRoutes(
	                new RouteBuilder()
	                {
	                    @Override
	                    public void configure() throws Exception
	                    {
	                        from("ibmmq:queue:DCC11INT.dcci.delta.com").to("stream:out"); //YY.ZZZ is your topic name. If Queue use ibmmq:queue:YY.ZZZ.
	                    }
	                });
	 
		ProducerTemplate template = camelContext.createProducerTemplate();
		 template.sendBody("ibmmq:topic:foo", "Fisrt Message");
		 camelContext.start();

 for (int i = 0; i < 5; i++) { 

 template.sendBody("ibmmq:queue:start", "body" + i); 
 } 

 // Wait five minutes, then stop
 Thread.sleep (60*5*1000);
 camelContext.stop ();
 }
}
 
 
