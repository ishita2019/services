package com.delta.pipeline.DCPipeline.dataobjects;

import java.util.ArrayList;
import org.apache.log4j.Logger;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delta.pipeline.DCPipeline.entity.FlightLegDetail;
import com.delta.pipeline.DCPipeline.entity.Quotes;

@RestController
@RequestMapping("/rest/db")
public class DBRepositoryServiceImpl {

	@Autowired
	private QuoteRepo repo;
	private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@Autowired
	private FlightLegDetailsRepository flightLegDetailsrepo;

/*	@GetMapping("/{userName}")
	@ResponseBody
	public List<String> listQuotes(@PathVariable("userName") final String userName) {
		System.out.println("userName: "+userName);
		return repo.findByUserName(userName)
				.stream()
				.map(q -> q.getQuote())
				.collect(Collectors.toList());
	}*/
	
	@GetMapping("/{userName}")
	@ResponseBody
	public Long flightLegDetails(@PathVariable("userName") final String userName) {
		LOGGER.info("Within flightLegDetails method");
		LOGGER.info("userName: "+userName);
		//List<String> out = new ArrayList<>();
		System.out.println("userName: "+userName);
		long count=flightLegDetailsrepo.count();
		System.out.println(flightLegDetailsrepo.count());
		  LOGGER.debug("Flight count from repo"+count);
			return flightLegDetailsrepo.count();	
	}
	
	@PostMapping("/add")
	@ResponseBody
	public Quotes addQuotes(@RequestBody final Quotes quote ) {
		return repo.save(quote);
	}
	
	@PostMapping("/delete")
	public boolean deleteQuotes(@RequestBody final Quotes quote ) {
		 repo.delete(quote);
		 return true;
	}

}
