package packageexam;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Newfeatures {

	public Newfeatures() {
		// TODO Auto-generated constructor stub
	System.out.println("Learning some of the java 8 features");
}

	// usage of foreach for getting the values from the HashMap
	
  public void acceptvalues()
  {
	 HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	 hmap.put("tejas",2);
	 hmap.put("anna",3);
	 hmap.put("work",6);
	 hmap.forEach((k,v)->System.out.println("Key is "+k+"  value is "+v));
 }
  
  public void streamexmp()
  {
	  List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	  List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	  System.out.println(filtered);
	  String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("|| "));
	  String mergedString1 = strings.stream().collect(Collectors.joining(", "));
	  System.out.println("Merged string using the filter "+mergedString);
	  System.out.println("Merged string excluding the filter "+mergedString1);
	  
	  
  }


  public static void main(String args[])
{
	Newfeatures nwf = new Newfeatures();
	nwf.acceptvalues();
	nwf.streamexmp();
}
  
}


