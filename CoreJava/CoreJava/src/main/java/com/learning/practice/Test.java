package com.learning.practice;

public class Test {
public static void main(String[] args) {
try{
	System.out.println("Try");
   System.exit(0);
   System.out.println("exit");;	
}catch(Exception e){
	System.out.println("Exception");
}finally{
	System.out.println("finally");
}
}
}
