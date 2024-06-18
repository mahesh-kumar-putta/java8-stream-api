package practice.java8.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques6 {

	public static void main(String[] args) {
		//Flatten list of lists of integers to list of integers
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(5,6,7,8);
		List<Integer> list3 = Arrays.asList(9,10,11,12);
		
		List<List<Integer>> listOfLists = new ArrayList<>();
		listOfLists.add(list1);
		listOfLists.add(list2);
		listOfLists.add(list3);
		
		List<List<Integer>> listOfLists2 = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));


		System.out.println(listOfLists.stream().flatMap(list->list.stream())
							.collect(Collectors.toList()));


	}

}
