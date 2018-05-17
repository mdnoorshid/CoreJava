package com.java.learning.CoreJava.hashmapimplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class HashMapImp {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
   //s1 and s2 will have same hashcode
	String s1 ="FB";
	String s2 ="Ea";
	System.out.println("s1 hashcode---> "+s1.hashCode());
	System.out.println("s2 hashcode---> "+s2.hashCode());
	map.put("bbb", 2);
	map.put("ccc", 3);
	map.put("ddd", 4);
	map.put("ddd", 5); //if we put same key it will update the current value
	map.put(s1,5);
	map.put(s2,6);
	
	List<String> list = new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
    
	
	/*Set<String> keys = map.keySet();
	
	for (String i : keys) {
		System.out.println(i);
	}
	System.out.println(map.get("ddd"));*/
	
	Set<Entry<String, Integer>> values = map.entrySet();
	
	/*for(Map.Entry<String,Integer> e :values){
		System.out.println(e);
	}
	*/
	values.stream().forEach(System.out::println);
	List<String> listStack = new Stack<>();
	
 
	
	
	
}
}
