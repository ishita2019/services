package com.delta.pipeline.DCPipeline.services;


//import org.apache.camel.CamelContext;
//import org.apache.camel.ProducerTemplate;
//import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.pipeline.DCPipeline.camel.routes.CamelRoutesBuilder;

@RestController
public class CamelController {
	
	//ProducerTemplate producerTemplate;

	
	//CamelContext camelContext;
	
	
	CamelRoutesBuilder camelRoutes;

	@RequestMapping(value = "/")
	public void startCamel() throws Exception {
		//producerTemplate.sendBody("direct:getOffers", "Calling via Spring Boot Rest Controller");
		
		//camelContext.addComponent("activemq", activeMQComponent("vm://localhost?broker.persistent=false"));
		//camelContext.addRoutes(camelRoutes);
	}

}
