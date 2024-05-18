package practice.java8.string;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8.SampleData;

public class FilterNames {

	// filter the List of Names ends with sh and store them in list
	public static void main(String[] args) {
		
		List<String> names = SampleData.getNames();
		List<String> filteredNames = names.stream().filter(s->s.endsWith("sh")).collect(Collectors.toList());
		
		System.out.println(filteredNames);

	}

}
