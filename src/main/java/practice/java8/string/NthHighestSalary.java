package practice.java8.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("mahesh", 10020);
		salaryMap.put("kumar", 2020);
		salaryMap.put("ramesh", 3020);
		salaryMap.put("suresh", 4020);
		salaryMap.put("harish", 15020);
		salaryMap.put("gireesh", 5020);
		salaryMap.put("vireesh", 10020);
		
		// won't work if we have more than one employee with same salary
		System.out.println(salaryMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
							.collect(Collectors.toList())
							.get(1));
		
		System.out.println(salaryMap.entrySet().stream()
								.collect(Collectors.groupingBy(Map.Entry::getValue,
										Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
										.entrySet().stream()
										.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
										.collect(Collectors.toList())
										.get(1)
										);
	}

}
