package com.tejas.pdfwritting;

import org.apache.log4j.Logger;


public class PdfGenerator {
	
	final static Logger logger = Logger.getLogger(PdfGenerator.class);

	public PdfGenerator() 
	{
      System.out.println("Working well"); 
	}
	
		public static void main(String args[])
		{
			System.out.println("Simple hello world program");
			logger.warn("Working well");
			LogChecker lch = new LogChecker();
		    logger.info("Starting the PDF creation");
		    PdfWritter pdf = new PdfWritter("Second.pdf");
		    pdf.pdfwrite();
		    
			
		}
	}

