package packageexam2;

import java.util.HashMap;

public class Java8features {

	public Java8features() {
		System.out.println("Learning some of the java 8 features");
	}
	
	public void acceptvalues()
	{
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("tejas",2);
		hmap.put("anna",3);
		hmap.put("work",6);
		
		hmap.forEach((k,v)->System.out.println("Key is "+k+"  value is "+v));
		
			
		}
		
}

