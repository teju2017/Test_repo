package com.maven.work;

import javax.xml.bind.JAXBContext;




import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;

public class JaxbMarshalling {

	public JaxbMarshalling(File fil) {
		if (fil.exists()) {
			fil.delete();
		}
		System.out.println("Just started doing the Marshaling");

	}

	public void filecheck(File filename) {
		if (filename.exists()) {
			System.out.println("XML FILE CREATION SUCCESSFUL");
		} else {
			System.out.println("Failed to create the file");
		}
	}

	public static void main(String args[]) {

		String XML_FILE_NAME = "C:/Homework/Student.xml";
		File filename = new File(XML_FILE_NAME);
		JaxbMarshalling abc = new JaxbMarshalling(filename);
		try {

			// creating the JAXB context, JAXB context needs to be created on
			// the class that forms the root element

			JAXBContext jContext = JAXBContext.newInstance(StudentList.class);

			// creating the marshaller object from the Jaxbcontext

			Marshaller marshallObj = jContext.createMarshaller();

			// setting the property to show xml format output

			marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// setting the values in the student POJO class

			Student student = new Student("abhishek", 1163, "hadoop", "Beginner");
			Student Student1 = new Student("Tejas", 2000, "AWS", "Intermediate");
			Student Student2 = new Student("Morshe", 3000, "IT admin", "Excellent");

			// Setting the values in the Teacher POJO class

			Teacher teacher1 = new Teacher("General knowledge", 20000, 20, "GK manjunath");
			Teacher teacher2 = new Teacher("General knowledge", 40000, 20, "Param");
			Teacher teacher3 = new Teacher("General knowledge", 10000, 10, "Nagaraj");

			Childclass chd1 = new Childclass("thejas", "HM");

		     Subelement sub1 = new Subelement("exp1", "exp2","Vada Paav");
			
			student.addsub(sub1); 
			
			// Adding the pojo class objects using a method in the StudentList
			// class on which the context is available

			StudentList lst = new StudentList();
			lst.adddetails(student);
			lst.adddetails(Student1);
			lst.adddetails(Student2);

			lst.addTeachers(teacher1);
			lst.addTeachers(teacher2);
			lst.addTeachers(teacher3);

			// lst.addchdlist(chd1);

			lst.setschool("Aravinda");
			lst.setcity("Hassan");

			// calling the marshall method for the Creation of the XML

			marshallObj.marshal(lst, new FileOutputStream(filename));
			abc.filecheck(filename);
			System.out.println("Its working OK");

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}
}
