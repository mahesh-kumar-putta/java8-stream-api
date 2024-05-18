package practice.java8.number;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import practice.java8.SampleData;

public class AverageOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = SampleData.getNumbers();
		
		OptionalDouble avg = numbers.stream().mapToInt(Integer::intValue).average();
		System.out.println(avg);
	}

}
