package practice.java8.number;

import java.util.Arrays;
import java.util.List;

public class ArrayElementsMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = {1,2,4,6,7,3};
		
		// 1*2*4*6*7*3
		List<Integer> intList = Arrays.asList(input);
		
	 System.out.println(intList.stream().reduce(1,(a,b)->a*b));
	}

}
