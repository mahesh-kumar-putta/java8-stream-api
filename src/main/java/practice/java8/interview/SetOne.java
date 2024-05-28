package practice.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import practice.java8.SampleData;

public class SetOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find words starting with A
		String[] names = {"abc","xyx","abb","abc","xyx"};
		
		List<String> namesList = Arrays.asList(names);
		
		System.out.println(namesList.stream().filter(word->word.startsWith("a")).collect(Collectors.toList()));
		
		// display duplicate words and their count
		namesList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
												.entrySet().stream()
												.filter(value->value.getValue()>1)
												.forEach(value -> System.out.println(value.getKey()+" : "+value.getValue()));
		
		

	}

}
