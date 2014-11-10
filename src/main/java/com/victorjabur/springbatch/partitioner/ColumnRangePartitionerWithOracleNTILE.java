package com.victorjabur.springbatch.partitioner;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class ColumnRangePartitionerWithOracleNTILE implements Partitioner {

	@Override
	public Map<String, ExecutionContext> partition(int gridSize) {
		Map<String, ExecutionContext> result = new HashMap<String, ExecutionContext>();
		
		for(int i=1; i <= gridSize; i++) {
			ExecutionContext value = new ExecutionContext();
			value.putInt("numBlock", i);
			result.put("Partition-" + i, value);
		}
		return result;
	}
}