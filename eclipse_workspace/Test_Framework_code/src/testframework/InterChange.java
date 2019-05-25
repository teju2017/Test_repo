package testframework;

public class InterChange {

	public String source;
	public String rep;
	public int counter;
	
	
	public InterChange(String source,String rep) {
		// TODO Auto-generated constructor stub
		this.source=source;
		this.rep=rep;
	}
	
	public int reverse()
	{
		while(true)
		{		
		 if(source.contains(rep))
		 {
			counter=counter+1;
			CharSequence a=source;
			CharSequence b = rep;
			System.out.println("Length is "+a.length());
			String res=source.replace(b,"");
			System.out.println("Response value is "+res);
			source=res;
		 } 
		 else
		 {
	  		break;
		 }
		}
		return counter;
		
	}
	
	public static void main(String args[])
	{
		InterChange it = new InterChange("aabcabaabbabbab","aa");
		System.out.println("Count value is "+it.reverse());
		
		
		
	}

}
