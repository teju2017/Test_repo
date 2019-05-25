package Package_tester;
import java.util.*;
import java.io.*;

public class Workinprogress 
{

    public Workinprogress()
    {
    	     System.out.println("Non parameterized constructor");
    }
    
    public Workinprogress(int x)
    {
    	  System.out.println("Paramter value passed is "+x);
    }
    
    public ArrayList retmethod()
    {
    	    ArrayList<Integer> x = new ArrayList();
    	    x.add(10);
    	    x.add(20);
    	    x.add(30);
    	    return x;
    }

    public void assignval()
    {
    	  ArrayList<Emptbl[]> emplist = new ArrayList();
    	  emplist.add(insertvalue());
    	  Iterator its = emplist.iterator();
    	  int counter=insertvalue().length;
    	  System.out.println("Counter value is "+counter);
    	  while(its.hasNext())
    	  {
    		   Emptbl[] ti = (Emptbl[])its.next();
    		   for(int a=0;a<counter;a++)
    		   {	   
    		       System.out.println("Dept id= "+ti[a].getdeptid()+" Dept name ="+ti[a].deptname+" Salary = "+ti[a].getSalary()+" ID= "+ti[a].getid());
    		   }    
    	  }
    	  
    }
    
    public Emptbl[] insertvalue()
    {
    	Emptbl[] obj = new Emptbl[4];
    	try
    	{
    	   System.out.println("Length of the array obj is "+obj.length);
           for(int i=0;i<obj.length;i++)
    	   {	 
    	   obj[i]= new Emptbl();
           obj[i].setdeptid("100"+" val_"+i);
           obj[i].setdeptname("Intellectual"+"val_"+i);
           obj[i].setid("234"+"val_"+i);
           obj[i].setSalary(50000+i);
           }
           return obj;
    	}
    	catch(Exception ae)
    	{
    		  System.out.println("Value is "+ae.getMessage());
    		  return obj;
    	}
    	
    	
    }	   
    	   
      
    
    public static void main(String args[])
    {
    	   Workinprogress ab = new Workinprogress();
    	   ArrayList<Integer> val;
    	   val= ab.retmethod();
    	   Iterator it = val.iterator();
    	   while(it.hasNext())
    	   {
    		   System.out.println("Value is "+it.next());
    	   }
    	   ab.assignval();
    	   
    }	   
}


