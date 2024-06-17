package practice.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day1 {

	public static void main(String[] args) {
		
		// even numbers
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,7,5,25,66,542,52,7654,89);
		
		System.out.println(intList.stream().collect(Collectors.groupingBy(i->i%2)));
		
		System.out.println(intList.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
		// sum of squares of numbers
		List<Integer> intList2 = Arrays.asList(1,2,3,4,5);
		System.out.println(intList2.stream().map(num->num*num).reduce(0,(a,b)->(a+b)));
		
		System.out.println(intList2.stream().mapToInt(n->n*n).sum());
		
		// separate odd and even numbers
		System.out.println(intList.stream().collect(Collectors.groupingBy(i -> i%2==0?"EVEN":"ODD")));
	}

}
