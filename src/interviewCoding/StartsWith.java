package interviewCoding;

import java.util.Arrays;
import java.util.List;

public class StartsWith {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ram","Abhi", "Amit","Amey","Ballraj","Samay","Abhishek");
		
		names.stream()
		.filter(name -> name.startsWith("A"))
		
		.forEach(System.out::println);
	}

}
