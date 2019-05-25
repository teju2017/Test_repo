package testframework;
import Package_tester.Sample1;

public class Checker 
{
	public int z,z1;
	
    public static void main(String args[])
    {
    	Checker loc_obj = new Checker();
    	System.out.println("I am working");  
    	A1 obj_a1 = new A1();
    	obj_a1.display_1();
    	Sample1 obj_sam = new Sample1();
    	obj_sam.setter(10,20);
    	loc_obj.z=obj_sam.getter_a();
    	loc_obj.z1=obj_sam.getter_b();
    	System.out.println("Value of z= "+loc_obj.z+" z1= "+loc_obj.z1);
    }
}
