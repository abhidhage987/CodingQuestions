package interviewCoding;

import java.util.Arrays;
import java.util.List;



public class EvenNumbers {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,25,30,47,53,67);
		
		list.stream()
		.filter(lists -> lists % 2 == 0)
		.forEach(System.out::println);
		
	}

}
