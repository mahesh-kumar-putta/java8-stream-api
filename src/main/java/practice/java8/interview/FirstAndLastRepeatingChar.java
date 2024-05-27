package practice.java8.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstAndLastRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first repititive, non-repititve char in  a string
		String name="maheshkumar";
		List<String> charList = Arrays.asList(name.split(""));
		
		System.out.println(charList.stream().collect(Collectors.groupingBy(Function.identity(),
											LinkedHashMap::new, Collectors.counting())));	
		
		System.out.println(charList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
												.entrySet().stream()
												.filter(c->c.getValue()>1)
												.findFirst()
												.get().getKey());
		
		
		System.out.println(charList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(c->c.getValue()==1)
				.findFirst()
				.get().getKey());

	}

}
