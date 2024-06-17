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
		Employee e2 = new Employee("kumar", "noida", 35);
		Employee e3 = new Employee("suresh", "chennnai", 15);
		Employee e4 = new Employee("ramesh", "bglr", 45);
		Employee e5 = new Employee("rahul", "hyd", 55);
		Employee e6 = new Employee("rajesh", "chennai", 24);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
 
		return employeeList;

	}
	
public static List<Employee2> getEmployees2() {
		
		Employee2 e1 = new Employee2("mahesh","kadapa",25,50000,true);
		Employee2 e2 = new Employee2("kumar", "noida", 35,25000, false);
		Employee2 e3 = new Employee2("suresh", "chennnai", 15, 49832,true);
		Employee2 e4 = new Employee2("ramesh", "bglr", 45,8765,true);
		Employee2 e5 = new Employee2("rahul", "hyd", 55,42443, true);
		Employee2 e6 = new Employee2("rajesh", "chennai", 24,50000, false);
		
		List<Employee2> employeeList = new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
 
		return employeeList;

	}
	
	

}
