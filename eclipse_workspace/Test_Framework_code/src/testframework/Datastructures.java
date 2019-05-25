package testframework;

import java.util.*;

public class Datastructures 
{
	
	 public Pojoclass setmethod(int a,int b,String x)
	 {
		     Pojoclass pj = new Pojoclass();
		     pj.setx(a);
		     pj.sety(b);
		     pj.setZ(x);
             return pj;
             
	 }
	 
	 public HashSet<String> Hashresponse()
	 {
		 HashSet<String> ab = new HashSet<String>();
		 ab.add("ab");
		 ab.add("ab");
		 ab.add("ab");
		return ab;
		 
	 }
	 
	 public List<String> Listresponse()
	 {
		 List<String> ab = new ArrayList<String>();
		 ab.add("ab");
		 ab.add("ab");
		 ab.add("ab");
		return ab;
		 
	 }
	 
	 
	 
     public static void main(String args[])
     {
    	   ArrayList<Pojoclass> A1 = new ArrayList();
    	   Datastructures obj = new Datastructures();
    	   if(args.length == 3 )
    	   {
    		     System.out.println("The program can proceed");
    		     System.out.println("Values passed are"+args[0]+" "+args[1]+" "+args[2]);
    	   }
    	   else
    	   {
    		     System.out.println("No parameter passed to the program, hence exiting");
    		     System.exit(1);
    	   }     
    	   int var1,var2;
    	   String var3;
    	   var1=Integer.parseInt(args[0]);
    	   var2=Integer.parseInt(args[1]);
    	   var3=args[2];
    	  // obj.setmethod(var1,var2,var3);
    	  Pojoclass prj=obj.setmethod(var1,var2,var3);
    	  Displayvalues a = new Displayvalues();
    	  a.getValues(prj);
    	 HashSet<String> abc = obj.Hashresponse();  
    	 Iterator it = abc.iterator();
    	 System.out.println("------------------------------------------");
    	 while(it.hasNext())
    	 {
    		 System.out.println("Values from the HASHSET "+it.next());
    	 }
    	 System.out.println("------------------------------------------");
    	 List<String> x = obj.Listresponse();
    	 Iterator itr = x.iterator();
    	 while(itr.hasNext())
    	 {
    		 System.out.println("Values from the List "+itr.next());
    	 }
    	 System.out.println("------------------------------------------");
    	  
    	   
    	   
     }
}
