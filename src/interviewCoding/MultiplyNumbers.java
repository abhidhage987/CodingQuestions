package interviewCoding;

import java.util.Arrays;
import java.util.List;

public class MultiplyNumbers {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,10,7,5,8);
		
		numbers.stream()
		.map(number -> number * 2)
		.forEach(System.out::println);
	}

}
