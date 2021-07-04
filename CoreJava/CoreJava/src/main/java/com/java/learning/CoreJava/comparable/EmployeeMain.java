package com.java.learning.CoreJava.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

     List<Employee> list = new ArrayList<>();
 
     list.add(new Employee(7,"Durgesh",544788446L,"Ruby Developer"));
     list.add(new Employee(1,"Md Noorshid",8431250146L,"Java Developer"));
     list.add(new Employee(2,"Joydeep Paul",90545544656L,"Java Developer"));
     list.add(new Employee(3,"Roopa Devan",8434554146L,"Tester"));
     list.add(new Employee(4,"Raja D",943455146L,"Java Developer"));
     list.add(new Employee(5,"Dileepa",84444550146L,"Java Developer"));
     list.add(new Employee(6,"Kishan",5444550146L,"UI Master"));
     
     Collections.sort(list); //sorting done based on phone number and is done through comparable interface also can say default sorting by class
     System.out.println(list);
     
     Comparator<Employee> comp = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {

			if(e1.getId() > e2.getId()){
				return 1;
			}else{
				return -1;
			}
			
		}
	};
	
	Collections.sort(list,comp);
	System.out.println(list);
	
	}

}
