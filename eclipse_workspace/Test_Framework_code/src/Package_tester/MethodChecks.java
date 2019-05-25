package Package_tester;

import OCAExam.*;

public class MethodChecks 
{
      public void caller(String methodname)
      {
    	     System.out.println("Calling the method "+methodname);     
      }
      
    
      public static void main(String args[])
      {
    	  try
    	  {
    	     CheckExamTopics obj = new CheckExamTopics();
    	     String Z=args[0];
    	     obj.Strchecks(Z);
    	  }
    	  catch(Exception ae)
    	  {
    		 System.out.println("Exception name "+ae.getLocalizedMessage()); 
    	  }
      }
      
      
}
