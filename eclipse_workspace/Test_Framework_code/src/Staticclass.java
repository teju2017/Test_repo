import java.util.*;
import java.io.*;

public class Staticclass 
{
    public static int x=0;
    public int y=0;
    public String str="Tejas";
	public Staticclass() 
	{
	    	  System.out.println("Constructor one");
	}
	
	public static void method1()
	{
		x=x+1;
		System.out.println("Value of x is "+x);
		// y=y+1; // On un commenting this code results in the error, since y is not static
	}
	
	public static void main(String args[])
	{
		Staticclass obj = new Staticclass();
		method1();
		method1();
		obj.method1();
		String abc = new String("checkone");
		System.out.println("value of str is "+abc);
		abc=obj.str;
		String def=abc.substring(0);
		System.out.println("DEF value is "+def);
		System.out.println("After assignment is "+abc);
		System.out.println("value of str is "+obj.str);
		obj.str="WORKING";
		System.out.println("value of str is "+obj.str);
	}

}
