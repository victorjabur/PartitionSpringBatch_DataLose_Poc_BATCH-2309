package com.victorjabur.springbatch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.victorjabur.springbatch.model.Record;

public class CustomItemProcessor implements ItemProcessor<Record, Record> {

	private Logger logger = LoggerFactory.getLogger(CustomItemProcessor.class);
	
	@Override
	public Record process(Record item) throws Exception {
		
		// This sleep is used for shuffle the thread order of running because
		// the processing time is very short
		Thread.sleep(10);
		
		logger.info("Processing..." + item + " BLOCK="+item.getNumBlock());
		return item;
	}

}