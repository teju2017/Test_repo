package packageexam;

import java.util.ArrayList;

public class Genericchecks<T> {

	public Genericchecks() {
		System.out.println("Checking the working of the Generics");
	}
	
	public ArrayList<T> retvalue(ArrayList<T> param)
	{
		ArrayList<T> art = new ArrayList<T>();
	    art=param;
		return art;
	}
	
	public static void main(String args[])
	{
		Genericchecks obj = new Genericchecks<>();
		ArrayList<String> abc = new ArrayList<>();
		abc.add("Work");
		abc.add("IN");
		abc.add("value");
		ArrayList<Integer> itr = new ArrayList<Integer>();
        itr.add(23);
        itr.add(45);
        ArrayList<Integer> oitr = obj.retvalue(itr);
		ArrayList<String> strlist=obj.retvalue(abc);
		for(String str : strlist)
		{
			System.out.println("Value is "+str);
		}
		
		System.out.println("Displaying the number value");
		
		for(Integer it : oitr)
		{
			System.out.println("Value is "+it.intValue());
		}
    }
}
