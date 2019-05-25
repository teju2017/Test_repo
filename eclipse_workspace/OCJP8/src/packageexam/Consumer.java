package packageexam;

public class Consumer implements Runnable {
	
	Producer pparam;

	public Consumer() {
		System.out.println("Consumer object is created");
	}
	
	public void setparamobj(Producer pparam)
	{
		this.pparam=pparam;
	}
	
	public Producer retobj()
	{
		return this.pparam;
	}
	
	public void displayvalues(StringBuffer sbr)
	{
		System.out.println("Value is "+sbr.toString().trim());
	}
	
	public void run()
	{
		//Producer po = new Producer();
		try
		{
		 System.out.println("Consumer run method to display the values in the string buffer");
		 for(int j=0;j<10;j++)
		 {
			Thread.sleep(900);
			// System.out.println("Returning status value is "+po.retstatus());
		    if(retobj().retstatus()){
			System.out.println("---------Consumer can start now----------------");
			displayvalues(retobj().sb);
			break;
			}
		    else{
			System.out.println("Waiting for Producer...");
			}
		 }
		}
		 catch(Exception ae)
		 {
			 System.out.println("Exception value is "+ae.getMessage());
		 }
		
	
	}
	
	public static void main(String args[])
	{
		Consumer cobj = new Consumer();
		Producer pobj = new Producer();
		cobj.setparamobj(pobj);
		Thread t1 = new Thread(cobj);
		Thread t2 = new Thread(pobj);
		t2.start();
		t1.start();
	}

}
