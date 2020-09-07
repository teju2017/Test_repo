package com.tejas.Spark.Test;




public class SparkTest {

	public SparkTest() {
		System.out.println("Working on Spark");
	}
	
	public static void main(String args[])
	{
		com.tejas.SparkSql.SparkSimpleProg obj = new com.tejas.SparkSql.SparkSimpleProg();
		//obj.queryRunner("SELECT * from people");
		obj.fileReader();
		System.out.println("################## READING FROM THE TABLE #########################  ");
		obj.Filesession();
		obj.fileWritter("json","FileThree");
	}

}
