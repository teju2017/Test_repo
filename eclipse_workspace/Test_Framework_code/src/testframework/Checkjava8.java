package testframework;

import java.util.function.BiFunction;

public class Checkjava8 
{
    public Checkjava8()
    {
    	  System.out.println("Its working");
    }
    
    public boolean null_check(String S)
    {
    	  if ( S.length() != 0 )
    	  {
    		  System.out.println("S is having the value "+S);
    		  return true;
    	  }
    	  else
    	  {
    		  System.out.println("String is null");
    		  return false;
    	  }
    }
    
    
    public static void main(String args[])
    {
    	  Checkjava8 chk = new Checkjava8();
    	  String Z="Check one";
    	  String Z1=null;
    	  int a;
    	  BiFunction<String,String,String> bi = (x,y) -> { return x+" "+y; };
    	  System.out.println(bi.apply("Life is", "Full of Complexity"));
    	  if (chk.null_check(Z))
    	  {
    		  System.out.println("You can proceed");
    	  }
    	  if(chk.null_check(Z1))
    	  {
    		  System.out.println("You can proceed");
    	  }
    	  
    }
}
