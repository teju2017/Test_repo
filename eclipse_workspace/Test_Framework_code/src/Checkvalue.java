import java.util.*;

public class Checkvalue {

	public Checkvalue() 
	{
		System.out.println("STARTING THE PROGRAME");
	}
	
	public int objreturn()
	{
		 int x=10;
		 return x;
	}
	
	public ArrayList<String> arraylist()
	{
		   ArrayList<String> x = new ArrayList<String> ();
		   x.add("CODING");
		   x.add("IN");
		   x.add("JAVA");
		   x.add("AFTER");
		   x.add("LONG");
		   x.add("TIME");
		   Pojoclass objarray[];
		   objarray=new Pojoclass[2];
		   objarray[0] = new Pojoclass();
		   objarray[1] = new Pojoclass();
		   Pojoclass obj1 = new Pojoclass();
		   obj1.setx(100);
		   obj1.sety("WORKING");
		   obj1.setz(95);
		   objarray[0].setx(20);
		   objarray[0].sety("Its ok");
		   objarray[0].setz(20);
		   objarray[1].setx(30);
		   objarray[1].sety("Its not ok");
		   objarray[1].setz(30);
		   ArrayList<Pojoclass> pj = new ArrayList<Pojoclass> ();
		   pj.add(obj1);
		   //     for(Pojoclass variable : pj)
		   for(Pojoclass variable : objarray )
		   {
			   System.out.println("Variable value is "+variable.getx());
			   System.out.println("Variable value is "+variable.gety());
			   System.out.println("Variable value is "+variable.getz());
		   }
		   return x;
	}
	

	
	public static void main(String args[])
	{
		  System.out.println("In the main programe");
		  Checkvalue obj = new Checkvalue();
		  int y=obj.objreturn();
		  ArrayList<String> z = obj.arraylist();
		  for ( String var:z )
		  {
			  System.out.println("Values are "+var);
		  }
		  
	}

}
