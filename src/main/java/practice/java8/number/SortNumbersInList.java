package practice.java8.number;

import java.util.List;
import java.util.stream.Collectors;

import practice.java8.SampleData;

public class SortNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = SampleData.getNumbers();
		System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
	}

}
