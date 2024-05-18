package practice.java8.number;

import java.util.List;
import java.util.OptionalDouble;

import practice.java8.SampleData;

// find sum of squares of numbers whose value is > 25
public class SquareFilterAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = SampleData.getNumbers();
		OptionalDouble avg = numbers.stream()
									.map((num)->num*num)
									.filter((num)->num>25)
									.mapToInt(Integer::valueOf)
									.average();
		System.out.println(avg);

	}

}
