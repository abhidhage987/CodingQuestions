package interviewCoding;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,10,34,56,76,75,85,90);
		
		numbers.stream().filter(number -> number % 2 != 0)
		.forEach(System.out::println);
	}

}
