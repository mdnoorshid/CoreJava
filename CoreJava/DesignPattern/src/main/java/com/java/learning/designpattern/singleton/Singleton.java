package com.java.learning.designpattern.singleton;


/*1.Ensure that only one instance of a class is created.
  2.Provide a global point of access to the object.
*/
//Lazy initialization using double lock mechanism
public class Singleton{
   private static Singleton instance;
   
   private Singleton(){
	System.out.println("Singleton(): Initializing Instance");   
   }
   
   public static Singleton getInstance(){
        if(instance == null){
        	
        	synchronized (Singleton.class) {
				if(instance == null){
					System.out.println("getInstance(): First time getinstance was invoked");
					instance = new Singleton();
				}
			}
        	
        }
	   
	   return instance;
   }
	
}
