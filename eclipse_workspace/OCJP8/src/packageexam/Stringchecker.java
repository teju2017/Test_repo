package packageexam;

import java.util.*;

public class Stringchecker {

	public Stringchecker() 
	{
		super();
		System.out.println("In the constructor");
	}
	
	public static int counter=0;
	
	public ArrayList<Integer> accept(ArrayList<Integer> xsd)
	{
		ArrayList<Integer> param= new ArrayList<Integer>();
		ArrayList<Integer> param_ret= new ArrayList<Integer>();
		param=xsd;
		System.out.println("Counter Value is "+(counter+30));
		for(int i : param)
		{
			 System.out.println("value of i "+i+" is "+(i+20));
			 param_ret.add((i+20));
		}
		return param_ret;
	}

	public static void main(String[] args) 
	{
		Stringchecker obj = new Stringchecker();
		int x=401;
		int y=45;
		int z=56;
		if(x>y)
        if(z<y)
				System.out.println("X value is greater ");
		        //System.out.println("Statement between if and else constructs");
			else
				System.out.println("Else clause");
		ArrayList<Integer> p1= new ArrayList<Integer>();
		p1.add(10);
		p1.add(20);
		p1.add(30);
		obj.accept(p1);
		System.out.println("Counter Value is "+counter);
		System.out.println("Counter Value is "+(counter+20));
		System.out.println("Counter Value is "+(counter+30));
	}

}
