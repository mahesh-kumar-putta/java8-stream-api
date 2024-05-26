package practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// contains methods to return sample data
public class SampleData {
		
	public static List<String> getNames(){	
		return Arrays.asList("Mahesh","Kumar","Suresh","Rahul");
	}
	
	public static List<Integer> getNumbers(){
		return Arrays.asList(1,2,3,4,5,6,7,8);
	}
	
	public static List<Employee> getEmployees() {
		
		Employee e1 = new Employee("mahesh", "hyd", 25);
		Employee e2 = new Employee("kumar", "noida", 25);
		Employee e3 = new Employee("suresh", "chennnai", 25);
		Employee e4 = new Employee("ramesh", "bglr", 25);
		Employee e5 = new Employee("rahul", "hyd", 25);
		Employee e6 = new Employee("rajesh", "chennai", 25);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
 
		return employeeList;

	}

}
