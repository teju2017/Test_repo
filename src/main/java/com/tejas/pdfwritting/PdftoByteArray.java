package com.tejas.pdfwritting;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileSystemUtils;

import com.google.common.io.Files;

public class PdftoByteArray {
	
	private String filename;
	
	public PdftoByteArray(String filename)
	{
		this.filename=filename;
	}
	
	public byte[] convert() throws Exception
	{ 
        	    
	    byte[] inFileBytes = java.nio.file.Files.readAllBytes(Paths.get(filename));
	    byte[] encoded = java.util.Base64.getEncoder().encode(inFileBytes);
	    return encoded;

	}
	
	public void filewrite(byte[] filwrite) throws Exception
	{
		FileOutputStream fos = new FileOutputStream("bytedata");
		fos.write(filwrite);
		
	}
	
	public void converttoPdf(byte[] bytdata) throws Exception
	{
		byte[] decoded = java.util.Base64.getDecoder().decode(bytdata);
		FileOutputStream out = new FileOutputStream("sample.pdf");
		out.write(decoded);
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		PdftoByteArray pdf = new PdftoByteArray("T:\\Eclipse_workspace\\pdf-generator\\Second.pdf");
	    byte[] byt=pdf.convert();
	    pdf.filewrite(byt);
	    pdf.converttoPdf(byt);
	}

}
