package com.basics.advance1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "e1"));
		empList.add(new Employee(2, "e2"));
		empList.add(new Employee(3, "e3"));
		empList.add(new Employee(4, "e4"));

		List<Department> depList = new ArrayList<Department>();
		depList.add(new Department(1, "d1"));
		depList.add(new Department(2, "d2"));
		depList.add(new Department(3, "d3"));

		Map<Employee, Department> empDepMap = new HashMap<>();
		empDepMap.put(new Employee(1, "e1"), new Department(1, "d1"));
		empDepMap.put(new Employee(1, "e1"), new Department(1, "d3"));
		empDepMap.put(new Employee(1, "e1"), new Department(1, "d2"));
		empDepMap.put(new Employee(2, "e2"), new Department(1, "d2"));
		empDepMap.put(new Employee(2, "e2"), new Department(1, "d1"));
		empDepMap.put(new Employee(3, "e3"), new Department(1, "d3"));

		// Sort on basis of employeeName and departmentName
		Map<Employee, Department> resultMap1 = empDepMap.entrySet().stream()
				.sorted(Map.Entry.<Employee, Department>comparingByKey(Comparator.comparing(Employee::getEmapName))
						.thenComparing(Map.Entry
								.<Employee, Department>comparingByValue(Comparator.comparing(Department::getDepName))))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		resultMap1.forEach((k, v) -> System.out.println(k.getEmapName() + ":" + v.getDepName()));

		System.out.println("===================================================");
		
		//Sort on basis of employeeName in asc and departmentName is desc
		Map<Employee, Department> resultMap2 = empDepMap.entrySet().stream()
				.sorted(Map.Entry.<Employee, Department>comparingByKey(Comparator.comparing(Employee::getEmapName))
						.thenComparing(Map.Entry
								.<Employee, Department>comparingByValue(Comparator.comparing(Department::getDepName)).reversed()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		resultMap2.forEach((k, v) -> System.out.println(k.getEmapName() + ":" + v.getDepName()));
		
		System.out.println("===================================================");
		
		//Sort on basis of departmentName asc and EmployeeName desc
		Map<Employee, Department> resultMap3 = empDepMap.entrySet().stream()
				.sorted(Map.Entry.<Employee, Department>comparingByValue(Comparator.comparing(Department::getDepName))
						.thenComparing(Map.Entry
								.<Employee, Department>comparingByKey(Comparator.comparing(Employee::getEmapName)).reversed()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		resultMap3.forEach((k, v) -> System.out.println(k.getEmapName() + ":" + v.getDepName()));

	}
}
