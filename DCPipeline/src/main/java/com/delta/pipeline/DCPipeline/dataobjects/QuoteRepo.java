package com.delta.pipeline.DCPipeline.dataobjects;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delta.pipeline.DCPipeline.entity.Quotes;

public interface QuoteRepo extends JpaRepository<Quotes,Integer> {

	List<Quotes> findByUserName(String userName);
 
}
