package testframework;


public class A5_main extends A4
{
      public A5_main()
      {
    	    System.out.println("Constructor in the class A5_main");
      }
      
      public static void main (String args[])
      {
    	    A5_main obj = new A5_main();
    	    A3 obj_std= new A3();
    	    obj.display_1();
    	    obj.display_2();
    	    A1.accept(1000);
    	    obj_std.standalone();
      }
}
