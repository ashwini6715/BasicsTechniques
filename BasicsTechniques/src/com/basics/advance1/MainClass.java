package com.basics.advance1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"e1"));
		empList.add(new Employee(2,"e2"));
		empList.add(new Employee(3,"e3"));
		empList.add(new Employee(4,"e4"));
		
		List<Department> depList=new ArrayList<Department>();
		depList.add(new Department(1, "d1"));
		depList.add(new Department(2,"d2"));
		depList.add(new Department(3,"d3"));
		
		Map<Employee, Department> empDepMap=new HashMap<>();
		empDepMap.put(new Employee(1,"e1"), new Department(1, "d1"));
	}
}
