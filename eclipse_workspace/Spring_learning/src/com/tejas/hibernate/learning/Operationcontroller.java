package com.tejas.hibernate.learning;

/* Program controlling the entire CRUD operation
 * Respective methods will be called based on the argument passed
 * Basically it does the operation on the two tables, Student and Dept
 */

public class Operationcontroller {

	public String operation;
	public static int id_num;
	
	public Operationcontroller() {
		System.out.println("Operationcontroller");
	}
	
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Please pass the opeation as the parameter");
			System.out.println("OPTIONS ARE ");
			System.out.println("1) READ");
			System.out.println("2) INSERT");
			System.out.println("3) UPDATE AND ID");
			System.out.println("4) DELETE AND ID");
			System.exit(1);
		}
		String operation=args[0].toString();
		//System.out.println("First parameter value is "+args[0]+ "  Second parameter value is "+args[1]);
		
		if(operation.contentEquals("UPDATE") || operation.contentEquals("DELETE"))
	    {
	      System.out.println("Length value is "+args.length);
		  if(args.length == 2)
		  {
			  Operationcontroller.id_num=Integer.parseInt(args[1]);
		  }
		  else
		  {
			System.out.println("For update and Delete operation, Need to pass the ID as parameter");
			System.exit(-1);
		  }
	    }
		switch(operation)
		{
		case "INSERT" : System.out.println("Parameter passed is INSERT");
		                Coreworking core = new Coreworking();
		                core.methodInsert();
		                break;
		case "READ"   : System.out.println("Parameter passed is READ");   
		                Readdata rd = new Readdata();
		                rd.selectStudent();
		                rd.selectDept();
		                break;
		case "UPDATE" : System.out.println("Parameter passed is UPDATE");
		                Updatedata upd = new Updatedata();
		                if(Operationcontroller.id_num != 0)
		                {
		                    upd.updateStudent(Operationcontroller.id_num);
		                }
		                break;
		case "DELETE" : System.out.println("Parameter passed is DELETE");
		                Deletedata dlt = new Deletedata();
		                if(Operationcontroller.id_num != 0)
		                {
		                	dlt.deleteStudent(Operationcontroller.id_num);
		                }
		                break;
		default       : System.out.println("Its a default");                
			            break;
	    }
	}
}
