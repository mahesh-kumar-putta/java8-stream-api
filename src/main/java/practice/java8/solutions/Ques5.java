package practice.java8.solutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques5 {

	public static void main(String[] args) {
		//concatenate String separated by comma
		
		List<String> stringList = Arrays.asList("mahesh","kumar","java","developer");
		
		System.out.println(stringList.stream().collect(Collectors.joining("-")));
	}

}
