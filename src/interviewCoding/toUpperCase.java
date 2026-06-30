package interviewCoding;

import java.util.Arrays;
import java.util.List;

public class toUpperCase {

	public static void main(String[] args) {
		
		List<String> names =   Arrays.asList("amit","ramesh","suresh","shyam");
		
		names.stream().map(name -> name.toUpperCase())
				.forEach(System.out::println);
		
		
		
//		List<String> names = Arrays.asList("abhi", "ram", "shyam", "amit");
//
//		names.stream()
//		     .map(String::toUpperCase)
//		     .forEach(System.out::println);
	}
}
