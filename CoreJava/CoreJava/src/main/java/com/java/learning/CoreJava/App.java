package com.java.learning.CoreJava;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.java.learning.CoreJava.model.Employee;
import com.java.learning.CoreJava.serialization.SerializationHandler;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
     /*Employee emp1 = new Employee(1,"Md Noorshid","Software Developer",2);
     Employee emp2 = new Employee(1,"Mr Adam","Software Developer",5);
     Employee emp3 = new Employee(1,"Mr John","UI Developer",5);*/
     
     SerializationHandler serializationHandler = new SerializationHandler();
   /*  serializationHandler.serializeObject(emp1, "C:\\Users\\mdnoo\\Desktop\\test\\serializationDemo.ser");
     serializationHandler.serializeObject(emp2, "C:\\Users\\mdnoo\\Desktop\\test\\serializationDemo.ser");
     serializationHandler.serializeObject(emp3, "C:\\Users\\mdnoo\\Desktop\\test\\serializationDemo.ser");*/
     
     Employee emp = (Employee) serializationHandler.deSerializeObject("C:\\Users\\mdnoo\\Desktop\\test\\serializationDemo.ser");
     logger.debug(emp);
     
    }
}
