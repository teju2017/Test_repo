package Package_tester;

import java.util.*;

public class DataFrame 
{
	
	public ArrayList<String> abc;

	
    public DataFrame()
    {
    	  System.out.println("Welcome to the world of DataFrame");
    }
    public void DataCheck()
    {
    	   System.out.println("This method is to return the ArrayList");
//    	   return abc;   	   
    }
     
    public static void main(String args[])
    {
    	 System.out.println("Dataframe is working");
    	 DataFrame obj = new DataFrame();
    	 obj.DataCheck();
    	 obj.abc.add("MY LIFE, MY PASSION");
    	 
    }
    

}
