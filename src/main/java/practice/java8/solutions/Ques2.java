package practice.java8.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ques2 {

	//Number of occurance of each character in a string
	public static void main(String[] args) {
		String course = "javaprogramminglanguage";
		
		List<String> charList = Arrays.asList(course.split(""));
		
		System.out.println(charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}

}
