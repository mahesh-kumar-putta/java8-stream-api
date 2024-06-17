package practice.java8.basic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import practice.java8.Employee2;
import practice.java8.SampleData;

public class Day2 {

	public static void main(String[] args) {
		List<Employee2> empList = SampleData.getEmployees2();

		// sort emps based on salary in asc
		System.out.println(empList.stream().sorted(Comparator.comparing(Employee2::getSalary))
									.collect(Collectors.toList()));
		
		// sort emps based on salary in desc
		System.out.println(empList.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed())
										.collect(Collectors.toList()));
	}

}
