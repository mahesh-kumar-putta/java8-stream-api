package practice.java8.interview;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8.Employee;
import practice.java8.SampleData;

public class EmployeeAgeGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Employees age>25
		
		List<Employee> empList = SampleData.getEmployees();
		System.out.println(empList.stream().collect(Collectors.groupingBy(emp->emp.getAge()>25)));
		
	}

}
