package com.tejas.pdfwritting;

import java.io.File;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfWritter {
	
	private String Filename;

	public PdfWritter(String Filename) {
		this.Filename=Filename;
		
	}
	
	public void filecheck()
	{
		
		File ab=new File(Filename);
		if(ab.isFile())
		{
			PdfGenerator.logger.info("File  "+ab+" already exists");
			if(ab.delete())
			{
				PdfGenerator.logger.info("File exists and hence removed");
			}
		}
	}
	
	public void pdfwrite()
	{
		Document document = new Document();
		filecheck();
		try
		{
		   PdfWriter pdfwrite = PdfWriter.getInstance(document, new FileOutputStream(Filename));
		   document.open();
		   document.add(new Paragraph("HARD WORK PAYS ALWAYS"));
		   document.addAuthor("Thejas HM");
		   document.addCreationDate();
		   document.addCreator("Creating the PDF using the Java Itext");
		   document.addTitle("Tittle created from the Programe");
		   document.addSubject("An example to show how attributes can be added to pdf files.");
		   
		   String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
		   Image image2 = Image.getInstance(new URL(imageUrl));
		   document.add(image2);
		    
		   document.close();
	       pdfwrite.close();
	       PdfGenerator.logger.info("Completing the PDF creation");
		   
		}
		catch(Exception ae)
		{
			System.out.println("Exception is "+ae.getMessage());
		}
	}
	
	public Document docobj()
	{
		return new Document();
	}
	

	 

}
