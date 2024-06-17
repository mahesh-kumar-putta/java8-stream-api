package practice.java8.solutions;

import java.util.Arrays;
import java.util.List;

public class Ques4 {

	public static void main(String[] args) {
		// Avg of numbers greater than 10 in given list
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,7,5,25,66,542,52,7654,89);
		
		System.out.println(intList.stream().filter(num -> num>10).mapToInt(num -> num).average());
	}

}