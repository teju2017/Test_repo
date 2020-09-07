package com.tejas.SparkSql;


import org.apache.spark.SparkConf;

import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;
import org.apache.hadoop.mapred.InputSplitWithLocationInfo;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.*;



public class SparkContextProvider {

	public SparkContextProvider() {
		// TODO Auto-generated constructor stub
		System.out.println("Spark context provider class is called");
	}
	
	
	static
	{
		Logger.getRootLogger().setLevel(Level.OFF);
		Logger.getLogger("org").setLevel(Level.OFF);
		Logger.getLogger("akka").setLevel(Level.OFF); 
		
	}
	
	public static JavaSparkContext ContextObject()
	{
        System.out.println("I am in the Context object method");
		SparkConf conf = new SparkConf().setAppName("SPARK_TRANSFORMER").setMaster("local[*]");
		JavaSparkContext sc = new JavaSparkContext(conf);
		sc.setLogLevel("OFF");
		return sc;
	}
	
	public static SparkSession sessionProvider()
	{
		Logger.getRootLogger().setLevel(Level.OFF);
		SparkSession spark = SparkSession.builder().appName("SPARK TRANSFORMER").config("Spark","Value").master("local[*]").getOrCreate();
		return spark;
	}

}
