package practice.java8.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2,3,4,3,3,4,4,1);
		
		Set<Integer> dups = nums.stream()
										.filter(e-> Collections.frequency(nums, e)>1)
										.collect(Collectors.toSet());
		
		System.out.println(dups);
										
	}

}
