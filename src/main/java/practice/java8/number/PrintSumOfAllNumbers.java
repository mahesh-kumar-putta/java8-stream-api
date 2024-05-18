package practice.java8.number;

import java.util.List;
import java.util.Optional;

import practice.java8.SampleData;

public class PrintSumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = SampleData.getNumbers();
		
		Integer sum1 = numbers.stream()
								.reduce(0,(a,b)->a+b);		
		System.out.println(sum1);
		
		//Approach 2
		Optional<Integer> sum2 =  numbers.stream()
										.reduce((a,b)->a+b);
		System.out.println(sum2.get());
		
		// Approach3
		int sum3 = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum3);
	}

}
