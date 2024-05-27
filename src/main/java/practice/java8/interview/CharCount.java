package practice.java8.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "maheshsuresh";
		String[] charName = name.split("");
		List<String> listName = Arrays.asList(charName);
		List<String> listName2  =listName;
		List<String> listName3  =listName;
		List<String> listName4  =listName;
		// characters count
		System.out.println(listName.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		// dup chars
		System.out.println(listName2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
											.entrySet()
											.stream()
											.filter(count->count.getValue()>1)
											.map(Map.Entry::getKey)
											.collect(Collectors.toList()));
		
		// unique chars
		System.out.println(listName3.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(count->count.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList()));
		
		// First non repeating char from a string
		System.out.println(listName4.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,  Collectors.counting()))
				.entrySet()
				.stream()
				.filter(count->count.getValue()==1)
				.findFirst()
				.get().getKey());
		
		// First repeating char from a string
		System.out.println(listName4.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,  Collectors.counting()))
				.entrySet()
				.stream()
				.filter(count->count.getValue()>1)
				.findFirst()
				.get().getKey());
		
		// second highest number in an array
		int[] nums = {2,4,5,6,22,22,22,9,3,5,7};
		
		// fails when we have highest number repeats
		System.out.println(Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toSet())
									.stream().sorted(Comparator.reverseOrder())
									.skip(1).findFirst().get());
		
		// find longest string from an array
		String[] names = {"mahesh","kumar","putta","andhrapradesh","tamilnadu","madhyapradesh"};
		
		List<String> namesList = Arrays.asList(names);
		
		System.out.println(namesList.stream().reduce((w1,w2)->w1.length()>w2.length() ? w1:w2).get());
		
	}

}
