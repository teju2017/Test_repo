package packageexam2;

public class Examtwo {

	
	protected int j=12;
	
	public Examtwo() {
		// TODO Auto-generated constructor stub
		System.out.println("Values in the packageexam2 package ");
	}
	
	public static int zx=4;
	
	static
	{
		 System.out.println("static class getting loaded first ");
	}
	
	{
		 System.out.println("Ananonymous block");
		 System.out.println("Ananonymous block value ");
	};
	
	public static void main(String args[])
	{
		for(int x=5;x<10;x++)
	    x++;
		// System.out.println("Value of execution is "+x);
		System.out.println("Value of execution is "+Examtwo.zx);
	}

}
