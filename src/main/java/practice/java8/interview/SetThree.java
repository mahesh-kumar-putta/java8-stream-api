package practice.java8.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SetThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, 500);
		Employee e2 = new Employee(2, 1000);
		Employee e3 = new Employee(3, 1500);
		Employee e4 = new Employee(4, 2000);
		Employee e5 = new Employee(5, 2500);
		Employee e6 = new Employee(6, 3000);
		Employee e7 = new Employee(7, 3500);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);


		// salaries in asc order based on salary
		
		System.out.println(empList.stream().sorted(Comparator.comparing(e->e.salary)).collect(Collectors.toList()));
		
		// salaries in desc order based on salary
		System.out.println(empList.stream().sorted(Collections.reverseOrder(Comparator.comparing(e->e.salary))).collect(Collectors.toList()));
		
		// fetch top 3 employee details
		System.out.println(empList.stream().sorted(Collections.reverseOrder(Comparator.comparing(e->e.salary))).limit(3).collect(Collectors.toList()));
		
		// less than 3rd highest
		System.out.println(empList.stream().sorted(Collections.reverseOrder(Comparator.comparing(e->e.salary))).skip(3).collect(Collectors.toList()));

	}

}

class Employee{
	
	int id;
	int salary;
	
	public Employee(int id, int salary) {
		this.id= id;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
	
}
