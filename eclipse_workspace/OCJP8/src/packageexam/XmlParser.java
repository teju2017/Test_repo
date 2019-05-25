package packageexam;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.text.ElementIterator;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XmlParser {

	public XmlParser() {
		System.out.println("XML parsing");
	}
	
	public void ereff()
	{
		try
		{
		   File fXmlFile = new File("sample.xml");
		   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		   DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		   Document doc = dBuilder.parse(fXmlFile);
		   NodeList nList = doc.getElementsByTagName("Doctype");
		   NodeList nList1 = doc.getElementsByTagName("KEY");
		   for(int i=0;i<nList.getLength();i++)
		   {
			   System.out.println("===================================================");
			   Node nNode = nList.item(i);
			   System.out.println("node name is "+nNode.getNodeName());
			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					int counter=eElement.getElementsByTagName("DOCTYPE_ENTRY_ATTR").getLength();
					System.out.println("Length of value is "+counter);
					for (int z=0;z<counter;z++)
					{	
					   System.out.println(eElement.getElementsByTagName("DOCTYPE_ENTRY_ATTR").item(z).getTextContent()+" =   "+eElement.getElementsByTagName("DOCTYPE_ENTRY_VALUE").item(z).getTextContent());
					}
					
					
			   }
		   //}
		   for(int j=0;j<nList1.getLength();j++)
		   {
			   Node nNode1 = nList1.item(j);
			   if (nNode1.getNodeType() == Node.ELEMENT_NODE) 
			   {
				   Element eElement = (Element) nNode1;
				   int counter=eElement.getElementsByTagName("KEY_TEXT").getLength();
				   for (int z=0;z<counter;z++)
				   {
					   System.out.println(eElement.getElementsByTagName("KEY_TEXT").item(z).getTextContent()+" =   "+eElement.getElementsByTagName("KEY_VALUE").item(z).getTextContent());
				   }
				   

			   }
			   
		   }
		   }
		}
		catch(Exception ae)
		{
			System.out.println("Exception object is "+ae.getMessage());
		}
		
	}

	public static void main(String args[])
	{
		XmlParser ab = new XmlParser();
		ab.ereff();
	} 
	
}
