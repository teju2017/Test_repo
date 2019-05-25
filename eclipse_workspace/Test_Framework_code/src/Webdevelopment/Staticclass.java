package Webdevelopment;

public class Staticclass 
{
    public static int x=0;
    public int y=0;
	public Staticclass() 
	{
	    	  System.out.println("Constructor one");
	}
	
	public static void method1()
	{
		x=x+1;
		System.out.println("Value of x is "+x);
		// y=y+1; // On uncommenting this code results in the error, since y is not static
	}
	
	public static void main(String args[])
	{
		Staticclass obj = new Staticclass();
		method1();
		method1();
		obj.method1();
	}

}
