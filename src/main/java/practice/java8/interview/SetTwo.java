package practice.java8.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import practice.java8.Employee2;
import practice.java8.SampleData;

public class SetTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee2> empList = SampleData.getEmployees2();
		
		// max and min salary
		System.out.println(empList.stream().map(e->e.getSalary()).reduce((a, b)->a>b?a:b));
		
		System.out.println(empList.stream().map(e->e.getSalary()).reduce((a, b)->a<b?a:b));
		
		// active and inactive employees
		System.out.println(empList.stream().collect(Collectors.groupingBy(emp->emp.isActive())));
		
		// emp age and count
		System.out.println(empList.stream().collect(Collectors.groupingBy(emp->emp.getAge(), Collectors.counting())));
		
		// sort hashmap<String, integer> based on value
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 13);
		map.put("ab", 43);
		map.put("anb", 53);
		map.put("ahuygf", 23);
		map.put("agh", 63);
		map.put("ahj", 83);
		map.put("akon", 73);
		
		System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
						.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
									(oldValue, newValue) -> oldValue, LinkedHashMap::new)));
		
		
		System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
							(oldValue, newValue) -> oldValue, LinkedHashMap::new)));



	}

}
