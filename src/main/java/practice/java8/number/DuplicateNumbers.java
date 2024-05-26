package practice.java8.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
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
		
		List<Integer> uniqueNums = nums.stream().filter(e->Collections.frequency(nums, e)==1).collect(Collectors.toList());
		System.out.println("uniqueNums "+uniqueNums);
		
		Set<Integer> numSet = new HashSet();
		nums.stream().filter(x-> ! numSet.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
		// print elements without duplicates
		nums.stream().filter(x-> numSet.add(x)).forEach(x->System.out.println(x));
		

		
		
										
	}

}
