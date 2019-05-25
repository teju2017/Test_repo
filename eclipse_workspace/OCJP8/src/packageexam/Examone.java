package packageexam;

import packageexam2.*;

public class Examone extends Examtwo {

	public Examone() {
		super();
	}
	
	{ System.out.println("Ananonymous block"); };
	
	public static Integer i =10;
	
	public void exccheck()
	{
	  try
	  {
		 String s=i.toString();
		 System.out.println("WOrking well "+s);
		 int i=Integer.parseInt("10");
		 System.out.println("Integer value is "+i);
		 System.out.println("Working well");
      }
	  catch(Exception ae)
	  {
		  System.out.println("Working on exception "+ae.getMessage());
	  }
	}
	
	public void Stringbuildercheck()
	{
		StringBuilder sb = new StringBuilder("work well");
		String C[] = {"a","b","c","d","e"};
		char[] C1={'1','Z','0','-','8','0','8'};
		sb.append(C1,0,C1.length-1);
		System.out.println("Value after append is "+sb);
	}
	
	public void sytemoutcheck()
	{
		int x=5;
		int y=4;
		System.out.println("Displaying the different system out print values ");
		System.out.println("#######################################################");
		System.out.println("Values are "+(x+y));
		System.out.println("Values are "+x+y);
		System.out.println(x+y);
	}
	
	public static void main(String args[])
	{
		 Examone e1= new Examone();
		 e1.exccheck();
		 Classtwo obj = new Classtwo();
		 obj.check();
		 obj.checker();
		 obj.ifcheck();
		 Examtwo et = new Examtwo();
		 System.out.println("Value in the examtwo class is ");
		 e1.Stringbuildercheck();
		 int kl=10;
		 System.out.println("Value is "+kl/4);
		 e1.sytemoutcheck();
	}
	}

