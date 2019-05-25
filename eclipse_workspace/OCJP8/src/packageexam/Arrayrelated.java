package packageexam;

import java.time.LocalTime;
import java.time.*;
import java.util.*;

public class Arrayrelated {

	private Arrayrelated() {
		// TODO Auto-generated constructor stub
		char[] C={'a','b','c','d','@'};
		System.out.println("Value is "+C[4] +" and   "+C[C.length-1]);
		int[][] arr = new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void currenttime()
	{
		  System.out.println(LocalTime.now());
		  LocalDate date = LocalDate.of(2015,3,26);
		  Period p= Period.ofDays(1);
		  System.out.println(date.plus(p));
	}
	
	public void complex()
	{
		System.out.println("Its fine");
		ArrayList<String> abc = new ArrayList<String>();
		abc.add("I");
		abc.add("am");
		abc.add("working");
		System.out.println("Total array list "+abc);
		String ws1[] = new String[abc.size()];
		String ws2[]=abc.toArray(ws1);
		System.out.println("WS1==WS2"+(ws1==ws2));
		System.out.println("ws1="+Arrays.toString(ws1));
		System.out.println("ws2="+Arrays.toString(ws2));
		ws1=new String[1];
		ws1[0]="TEJAS";
		ws2=abc.toArray(ws1);
		System.out.println("WS1==WS2"+(ws1==ws2));
		System.out.println("ws1="+Arrays.toString(ws1));
		System.out.println("ws2="+Arrays.toString(ws2));
		Integer number = Integer.valueOf("100");
		System.out.println("Variable value is "+number);
	}

		
		public void Twodimensional()
		{
			System.out.println("Checking for the values ");
			int[][] x = new int[5][5];
			x[0][0]=1200;
			x[0][1]=2;
			System.out.println("Length of the array x is "+x.length +" and value is "+x[0][0]);
		}
		
		public void twodimensionvalueinitialize()
		{
			int[][] arrInt = { { 1, 2 ,10},{ 3, 4, 5,6 } };
			for (int i = 0; i < arrInt.length; i++) {
				for (int j = 0; j < arrInt[i].length; j++) {
					System.out.println("i="+i+" and J= "+j+" and value is "+arrInt[i][j] + " ");
				}
				System.out.println("");
			}
		}
		
		public void twodimenstweak()
		{
			int xy[][]= {{2,3,4,5},{3,4,5,6},{56,57,58},{45,46,47,67}};
			for (int i = 0; i < xy.length; i++) {
				for (int j = 0; j < xy[i].length; j++) {
					System.out.println("i="+i+" and J= "+j+" and value is "+xy[i][j] + " ");
				}
				System.out.println("");
			}
		}
		
		public void bytecheck()
		{
			  ///int y[]=new int[ob101];
			  int y1[][]=new int[10][];
			  //y1[0][1]=120;
			  System.out.println("Array values are "+y1.length);
			  
		}
		
		public void singlearray()
		{
			int tej[] = new int[10];
			//System.out.println("Length of array is "+tej.length+" and value of eleventh element is "+tej[10]);
			//int val[]=new int[-5];
			//System.out.println("Length of array is "+val.length+" and value of eleventh element is "+val[-1]);
		}
		
		public void doublecheck()
		{
			Double abc=Double.valueOf("120D");
			System.out.println("Value is "+abc);
		}
		
		public static void main(String args[])
		{
			Arrayrelated obj = new Arrayrelated();
			obj.Twodimensional();
			System.out.println("Calling the initialization value method");
			obj.twodimensionvalueinitialize();
			obj.twodimenstweak();
			obj.bytecheck();
			obj.singlearray();
			obj.doublecheck();
			obj.currenttime();
			obj.complex();
		}
		
	}

