package com.tejas.SparkSql;


import org.apache.spark.api.java.JavaRDD;



import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.io.File;
import java.util.*;

public class SparkSimpleProg implements OperationDetails  {

	public SparkSimpleProg() {
		// TODO Auto-generated constructor stub
	}

	/*public Dataset<Row> fileReader() {
		Dataset<Row> Reader=SparkContextProvider.ContextObject().read().json("C:/Spark/sample_file/abc.json");
		Reader.show();
		Reader.createOrReplaceTempView("people");
		return Reader;
	}*/
	

	
	
	public  void fileReader(){
		JavaRDD<String> lines=SparkContextProvider.ContextObject().textFile("C:/Spark/sample_file/abc.json");
		List<String> lst=lines.collect();
		for(String abc:lst)
		{
			System.out.println("Reading the lines"+abc);
		}
	}
	
	public void Filesession()
	{
		SparkSession sessobj;
		sessobj = SparkContextProvider.sessionProvider();
		// Dataset<Row> Reader=sessobj.read().json("C:/Spark/sample_file/abc.json");
		System.out.println("Reading the Parquet file");
		Dataset<Row> Reader=sessobj.read().parquet("C:\\COMPLETE\\Projectwork\\SparkToolConfigurator\\FileToWrite\\Fileone");
		try
		{
		    Reader.createOrReplaceTempView("Tejas");
		    System.out.println("Just before reading from the SQL");
		    //Dataset<Row> sqlDF = sessobj.sql("SELECT count(*),name FROM Tejas group by name having count(*) > 1 ");
		    Dataset<Row> sqlDF = sessobj.sql("SELECT * from Tejas");
		    sqlDF.show();
		}
		catch(Exception ae)
		{
			System.out.println("Exception object is"+ae.getMessage());
		}
		
	}
	
	public void fileWritter(String format,String Filename)
	{
		
		System.out.println(" ############ FILE WRITTING HAS BEEN REQUESTED ######################  ");
		System.out.println("FORMAT PASSED IS "+format);
		SparkSession sessobj;
		sessobj = SparkContextProvider.sessionProvider();
		Dataset<Row> Reader=sessobj.read().json("C:/Spark/sample_file/abc.json");
		try
		{
			System.out.println("Calling the Filewritter method");
		    Reader.createOrReplaceTempView("Tejas");
		    System.out.println("Just before reading from the SQL");
		    //Dataset<Row> sqlDF = sessobj.sql("SELECT count(*),name FROM Tejas group by name having count(*) > 1 ");
		    Dataset<Row> sqlDF = sessobj.sql("SELECT * from Tejas");
		    sqlDF.show();
		    File x =new File("C:\\COMPLETE\\Projectwork\\SparkToolConfigurator\\FileToWrite\\File.dat");
		    if(x.exists())
		    {
		    	System.out.println("File already exists and hence exiting ");
		    	System.exit(0);
		    }
		    sqlDF.select("name").write().format(format).save("C:\\COMPLETE\\Projectwork\\SparkToolConfigurator\\FileToWrite\\"+Filename);
		    System.out.println("File writting is successful");
		    
		}
		catch(Exception ae)
		{
			System.out.println("Exception object is"+ae.getMessage());
		}
	}
	

	public void transformation() {
		// TODO Auto-generated method stub
		
	}

	public void tempwritting() {
		// TODO Auto-generated method stub
		
	}

	public void queryRunner(String Sql) {
		// Dataset<Row> DF=SparkContextProvider.ContextObject().sql(Sql);
		//SparkSimpleProg prog= new SparkSimpleProg();
		//prog.fileReader().
	}

}
