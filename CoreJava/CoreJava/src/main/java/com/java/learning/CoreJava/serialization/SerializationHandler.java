package com.java.learning.CoreJava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Class to handle serialization and deserialization
 * Def :
 * Serialization is a mechanism of converting the state of an object into a byte stream. 
 * Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
 * This mechanism is used to persist the object.
 * @author mdnoorshid
 *
 */
public class SerializationHandler {

	/**
	 * Method to serialize object
	 * 
	 * @param obj
	 *            : target object
	 * @param destinationPath
	 *            : target path to store the serialized object
	 */
	public void serializeObject(Object obj, String destinationPath) {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(destinationPath);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(obj);
			System.out.println("Serialization completed....");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (objectOutputStream != null) {
					objectOutputStream.close();
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

	}

	/**
	 * Method to deserialize object
	 * @param sourceFilePath : source path where serialized object is stored
	 * @return
	 * @throws IOException
	 */
	public Object deSerializeObject(String sourceFilePath) throws IOException {
		Object object = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(sourceFilePath);
			objectInputStream = new ObjectInputStream(fileInputStream);
			object = objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} finally{
			if(fileInputStream !=null){
				fileInputStream.close();
			}if(objectInputStream != null){
				objectInputStream.close();
			}
			
		}
		return object;
	}
}
