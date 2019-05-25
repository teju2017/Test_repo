package packageexam;

public class Producer implements Runnable {

	public StringBuffer sb;
	public Boolean prodstatus;
	
	public Producer() {
		sb= new StringBuffer();
		this.prodstatus=false;
	}
	
	public void run()
	{
		try
		{
		for(int i=0;i<10;i++)
		  {
		  sb.append(i);
		  Thread.sleep(800);
		  }
		  System.out.println("Setting the value of status to true");
		  prodstatus=true;
		  setstatus(prodstatus);
		  System.out.println("Produer has completed the task");
		}
		  catch(Exception ae)
		  {
			  System.out.println("Exception value is "+ae.getMessage());
		  }
	}

		
	
	public void setstatus(Boolean status)
	{
		prodstatus=status;
	}
	
	public Boolean retstatus()
	{
		return prodstatus;
	}

}
