package practice.java8.terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import practice.java8.SampleData;

public class EvenOddNumbersMap {
	
	public static void main(String[] args) {
		List<Integer> numbers = SampleData.getNumbers();
		Map<Object, List<Integer>> evenOddMap = numbers.stream()
													.collect(Collectors.groupingBy(num->num%2==0?"EVEN":"ODD"));
		
		System.out.println(evenOddMap);
	}	
	
}
