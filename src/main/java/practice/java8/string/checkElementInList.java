package practice.java8.string;

import java.util.List;

import practice.java8.SampleData;

public class checkElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = SampleData.getNames();
		System.out.println(names.stream().anyMatch(s->s.equalsIgnoreCase("kumar")));
	}

}
