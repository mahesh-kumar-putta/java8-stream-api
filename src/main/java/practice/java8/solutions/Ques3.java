package practice.java8.solutions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import practice.java8.Employee2;
import practice.java8.SampleData;

public class Ques3 {

	public static void main(String[] args) {
		//Employee with highest salary
		List<Employee2> empList = SampleData.getEmployees2();
		
		System.out.println(empList.stream().reduce((e1,e2)-> e1.getSalary()>e2.getSalary()?e1:e2));
		
		System.out.println(empList.stream().max(Comparator.comparingInt(Employee2::getSalary)));
		
		//Employee with highest salary ( with 2 emps having highest salary)
		System.out.println(empList.stream()
                .collect(Collectors.groupingBy(Employee2::getSalary))
                .entrySet().stream()
                .max(Comparator.comparingInt(e -> e.getKey()))
                .map(entry -> entry.getValue()));
		
		
	}

}
