package practice.java8.string;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8.SampleData;

public class SortNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = SampleData.getNames();
		System.out.println(names.stream().sorted().collect(Collectors.toList()));
	}

}
