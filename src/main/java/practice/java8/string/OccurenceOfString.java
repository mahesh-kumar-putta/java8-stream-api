package practice.java8.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfString {

	// count the number of occurance of a given string
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a new string variable new variable string";
		List<String> wordList =  Arrays.asList(str.split(" "));
		
		Map<Object, List<String>> map = wordList.stream().collect(Collectors.groupingBy(s->s, Collectors.toList()));
		
		System.out.println(map);
		
		System.out.println(wordList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
	}

}
