package practice.java8.string;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8.Employee;
import practice.java8.SampleData;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = SampleData.getEmployees();
		
		// Map<City, List<Employee names>>
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.getCity(), 
				Collectors.mapping(e->e.getName(), Collectors.toList()))));
	}

}
