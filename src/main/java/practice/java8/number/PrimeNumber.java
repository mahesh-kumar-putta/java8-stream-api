package practice.java8.number;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		
		boolean ans = IntStream.range(2, number).noneMatch(n->number%n==0);
		
		System.out.println(ans);

	}

}
