package com.victorjabur.springbatch;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.UnexpectedJobExecutionException;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.JobParametersNotFoundException;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunnerJdbcPagingItemReaderOracleRownumJOB {
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException, NoSuchJobException, JobParametersNotFoundException, UnexpectedJobExecutionException {

		String[] springConfig  = 
			{	
				"spring/batch/jobs/job-JdbcPagingItemReader-OracleNtile.xml" 
			};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		JobOperator jobOperator = (JobOperator) context.getBean("jobOperator");
		Long id = jobOperator.startNextInstance("jdbcPagingItemReader-OracleNtileJOB");

		System.out.println("Done");

	}
}
