import java.util.*;


public class Progvalue 
{
	
	public void accept(Progvalue ed)
	{
		  System.out.println("Accept value is "+ed.toString());
	}

	public Progvalue() 
	{
            System.out.println("Get the value now for the exact value");
	}
	
	public void acceptval(ArrayList<Pojoclass> pg1)
	{
		ArrayList<Pojoclass> pg2 = new ArrayList();
        pg2=pg1;
        for(Pojoclass lp : pg2)
        {
        	System.out.println("X integer value is "+lp.getx());
        }
	}
	
	public void hasmapvalue()
	{
		 HashMap<Integer,String> hsx = new HashMap();
		 hsx.put(124,"Mapvalue");
		 hsx.put(234,"UOB");
		 hsx.put(3456,"DBS");
		 hsx.put(34,"UBS");
		 System.out.println("HASHMAP VALUE GETTING map value "+hsx.get(34));
		 HashMap<Integer,HashMap<Integer,String>> hsx1 = new HashMap();
		 hsx1.put(1200,hsx);
		 for(Integer it1 : hsx1.keySet())
		 {
			 System.out.println("Hash key Value is "+it1.intValue());
			 // System.out.println("Hash value is ");
		 }
		 for(Integer it1 : hsx.keySet())
		 {		 
		      for(HashMap<Integer,String> it2 : hsx1.values())
		      {
			      System.out.println("Key is "+it1.intValue()+" and Value is "+it2.get(it1.intValue()));
		      }
		 }
	}
		 
		 
		
	
	public static void main(String args[])
	{
      try
      {
		  Progvalue obj = new Progvalue();
		  Pojoclass oj[] = new Pojoclass[4];
		  oj[0]=new Pojoclass();
		  oj[1]=new Pojoclass();
		  oj[2]=new Pojoclass();
		  oj[3]=new Pojoclass();
		  System.out.println("Getting the second value is "+oj[0].getx());
		  oj[0].setx(100);
		  oj[0].sety("Tejas");
		  oj[0].setz(200);
		  oj[1].setx(100);
		  oj[1].sety("Malathi");
		  oj[1].setz(200);
		  oj[2].setx(100);
		  oj[2].sety("Murali");
		  oj[2].setz(200);
		  oj[3].setx(230);
		  oj[3].sety("MMMM");
		  oj[3].setz(345);
		  System.out.println("Working second one ");
		  ArrayList<Pojoclass> ar1 = new ArrayList();
		  ar1.add(oj[0]);
		  ar1.add(oj[1]);
		  ar1.add(oj[2]);
		  ar1.add(oj[3]);
		  obj.hasmapvalue();
		  for(Pojoclass var:ar1)
		  {
		 	System.out.println("Name value is  "+var.y);
		  }
		  obj.acceptval(ar1);
		 }
         
         catch(Exception ae)
         {
    	     System.out.println("Exception value "+ae.getMessage());
         }
        
	}
}

	
