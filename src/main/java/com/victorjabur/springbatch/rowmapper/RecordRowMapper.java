package com.victorjabur.springbatch.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import com.victorjabur.springbatch.model.Record;

public class RecordRowMapper implements RowMapper<Record> {

	private Logger logger = LoggerFactory.getLogger(RecordRowMapper.class);

	public Record mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Record record = new Record();
		record.setId(rs.getInt("ID"));
		record.setDescription(rs.getString("DESCRIPTION"));
		try{
			record.setNumBlock(rs.getInt("NUM_BLOCK"));			
		}catch(Exception e){
			logger.warn("This attribute is not used whith Primary Key Example");
		}
		return record;
	}

}