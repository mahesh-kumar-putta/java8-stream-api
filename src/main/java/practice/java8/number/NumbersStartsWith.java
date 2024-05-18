package practice.java8.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(2,3,4,33,44,998,12,23);
		
		List<Integer> filteredNums = nums.stream()
										.map(num->num.toString())
										.filter(num->num.startsWith("3"))
										.map(Integer::valueOf)
										.collect(Collectors.toList());
		
		System.out.println(filteredNums);

	}

}
