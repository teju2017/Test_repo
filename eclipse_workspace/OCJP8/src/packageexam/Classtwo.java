package packageexam;

public class Classtwo implements Interfaceone,Interfacetwo
{

	/* public Classtwo() {
		// TODO Auto-generated constructor stub
	} */
	
	public int y;
	public void check()
	{
		for(int y=0;y<10;y++)
	   {
		  System.out.println("Value is "+y);
	   }
		int x=4;
		int v=5;
		int lmn=0145;
		//if(x>v)
			if(v>x)
			System.out.println("Checking the CRUCIAL");
			System.out.println("Value of LMN is  "+lmn);
			
			
	}
	
	public void ifcheck()
	{
		int z=-5;
		int x=-2;
		int a=-3;
		Double D1=0.0/0.0;
		System.out.println("Double value check "+Double.isNaN(D1));
		System.out.println("Double value check "+D1.isInfinite());
		if(x>-4)
	    if(a>-5)
	    if(z>-8)
	    System.out.println("Checking the IF condition statements");
		
		System.out.println(""+(1+2));
		System.out.println(""+1+2);
		
		
	}
	
	 
	
	public void checker()
	{
		int x=20;
		while(x>0)
		{
			do
			{
				x=x-2;
				System.out.println("Value is "+x);
			} while(x>4); 

		}
	}
}
