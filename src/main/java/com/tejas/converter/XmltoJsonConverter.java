package com.tejas.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmltoJsonConverter {
	 
	public String xmlcontents;
	
	public XmltoJsonConverter(String xmlcontents)
	{
		this.xmlcontents=xmlcontents;
	}
	
	
	public void filewritting(String filecontents) throws Exception
	{
		 File fileobj = new File("content_file.json");
		 FileOutputStream output = new FileOutputStream(fileobj);
		 output.write(filecontents.getBytes());
		 
	}
	
	public JsonNode convertandSend() throws Exception
	{
		XmlMapper xmlmapper = new XmlMapper();
	    JsonNode node = xmlmapper.readTree(xmlcontents.getBytes());
	    System.out.println("Node value is "+node.toString());
	    return node;
	}
	
	public String Jsonwritter(JsonNode nodes) throws Exception
	{
		 ObjectMapper jsonmapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
		 String json = jsonmapper.writeValueAsString(nodes);
		 return json;
	}
	
	public static void main(String args[]) throws Exception
	{

		File fil = new File("T:\\Eclipse_workspace\\JSONConverter\\src\\main\\resources\\Sample.xml");
		FileInputStream files = new FileInputStream(fil);
		byte[] buffer = new byte[10];
		StringBuilder sb = new StringBuilder();
		while(files.read(buffer) != -1 )
		{
			sb.append(new String(buffer));
			buffer=new byte[10];
		}
		files.close();
		XmltoJsonConverter obj = new XmltoJsonConverter(sb.toString());
		JsonNode nod= obj.convertandSend();
		System.out.println(" JSON object writter value ="+
		                     obj.Jsonwritter(nod) );
		obj.filewritting(obj.Jsonwritter(nod));
	}
	

}
