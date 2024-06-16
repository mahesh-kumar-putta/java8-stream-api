package practice.java8.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import practice.java8.Employee3;

public class HighestSalaryInEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee3 emp = new Employee3(1234,"MECH");
		Employee3 emp1 = new Employee3(1534,"CIVIL");
		Employee3 emp2 = new Employee3(12374,"MECH");
		Employee3 emp3 = new Employee3(312394,"CHEM");
		Employee3 emp4 = new Employee3(12340,"CHEM");
		Employee3 emp5 = new Employee3(81234,"CIVIL");
		
		List<Employee3> empList = new ArrayList<>();
		
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		System.out.println(empList.stream().collect(Collectors.groupingBy(e->e.getDept(),
				            			Collectors.maxBy(Comparator.comparing(e->e.getSalary())))));
		

	}

}
