package practice.java8.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques1 {

	//Group a list of strings by their length
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = Arrays.asList("Mahesh","kumar","putta","kadapa","America","France","Hyderabad");
		
		System.out.println(stringList.stream().collect(Collectors.groupingBy(s ->s.length())));
		
	}

}
