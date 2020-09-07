package com.tejas.SparkSql;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;


public interface OperationDetails {
	
	public  void fileReader();
	
	public void transformation();
	
	public void tempwritting();
	
	public void queryRunner(String Sql);
	
	
}
