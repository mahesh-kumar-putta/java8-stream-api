package practice.java8.number;

import java.util.List;

import practice.java8.SampleData;

public class MaxAndMinNumber {
	
	public static void main(String[] args) {
		List<Integer> numbers = SampleData.getNumbers();
		System.out.println(numbers.stream().mapToInt(Integer::intValue).min());
		System.out.println(numbers.stream().mapToInt(Integer::intValue).max());
		
		System.out.println(numbers.stream().reduce((a,b)->a>b?a:b));
		System.out.println(numbers.stream().reduce((a,b)->a<b?a:b));

	}
}
