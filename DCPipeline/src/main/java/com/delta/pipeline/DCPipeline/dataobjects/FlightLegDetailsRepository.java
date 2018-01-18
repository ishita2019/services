package com.delta.pipeline.DCPipeline.dataobjects;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.pipeline.DCPipeline.entity.FlightLegDetail;


public interface FlightLegDetailsRepository extends JpaRepository<FlightLegDetail,Integer>{
	
	//List<FlightLegDetail> findByCarrierCode(String CRR_CD);
	

}
