package packageexam;

import java.util.*;

public class Checktwo {

	public Checktwo() 
	{
	   System.out.println("Working is completed");
	}
	
	public Boolean working(Boolean val)
	{
		String S1="TRUE";
		System.out.println("Working well here ");
		if(val.toString().equalsIgnoreCase(S1))
		{
			System.out.println("Important logger definning the value ");
		}
		return val;
	}
	
	public ArrayList<Classtwo> valuereturn()
	{
		Classtwo obj= new Classtwo();
		Classtwo obj1=new Classtwo();
		ArrayList<Classtwo> al = new ArrayList<Classtwo>();
		al.add(obj1);
		al.add(obj);
		return al;
	}
	
	public static void main(String args[])
	{
		System.out.println("Its working well");
		Checktwo oj= new Checktwo();
		oj.working(true);
		try
		{
		for ( Classtwo var:oj.valuereturn())
		{
			System.out.println("============CALLING THE METHOD CHECKS =====================");
			var.check();
		    Thread.sleep(5000);
		    System.out.println("==========EXECUTION AFTER 5 SECONDS========================");
		    Thread.sleep(3000);
		}
		}
		catch(Exception ae)
		{
			System.out.println("Exception value is "+ae.getMessage());
		}
	}

}
