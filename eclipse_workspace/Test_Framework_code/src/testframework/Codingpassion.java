package testframework;

import java.util.*;

public class Codingpassion 
{
	 public static 	int counter=0;
	 public Codingpassion()
	 {
		    System.out.println("Default constructor");
	 }
	 
	 public Codingpassion(int x)
	 {
		    super();
		    System.out.println("Paramterized Constructors");
		    
	 }
	 
	 public String[] Splitter(String S2,String pattern)
	 {
		   String[] Z= S2.split(pattern);
		   S2.trim();
		   Boolean ab=S2.contains("TEST");
		   for(int x=0;x<Z.length;x++)
		   {
			    System.out.println("Value "+x+" is  "+Z[x]);
		   }
		   System.out.println("Value is "+ab);
		   return Z;
		 
	 }
	 
	 public void collectiondetails(String Z1[])
	 {
		  HashMap<String,String> hm = new HashMap();
		  hm.put("Tejas","One");
		  hm.put("Working","Two");
		  for(Map.Entry<String,String> x : hm.entrySet())
		  {
			    String S=x.getKey();
			    String s2=x.getValue();
			    System.out.println("Key is "+S+" Value is   "+s2);
		  }
		  
	 }
	 
	 public Codingpassion objreturn()
	 {
		   return new Codingpassion();
	 }
	 
	 public void display(String S)
	 {
		    System.out.println("String value passed is "+S);
	 }
	 
	 public static void counter()
	 {
		        counter=counter+1;
		        System.out.println("Counter value is "+counter);
	 }
	 
	 
	 public static void main(String args[])
	 {
		     Codingpassion pe = new Codingpassion(100);
		     Codingpassion mn=pe.objreturn();
		     mn.display("Coding is my Passion");
		     System.out.println("Checking the static value counter");
		     mn.counter();
		     mn.counter();
		     mn.counter();
		     System.out.println("Calling the String Splitter with :");
		     mn.Splitter("TEJU:TEST:IT:OUT:",":");
		     System.out.println("Calling the String Splitter with \\s");
		     String Z2[]=mn.Splitter("TEJU TEST IT OUT","\\s");
		     mn.Splitter("","\\s");
		     mn.collectiondetails(Z2);
		     Codingpassion te = new Codingpassion();
		     te.counter();
	 }
	 

}
