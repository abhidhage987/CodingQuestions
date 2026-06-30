package interviewCoding;

import java.util.stream.IntStream;

public class ReverseString6 {
	//Using Java 8 Streams
	
	public static void main(String[] args) {
		
		String str =" Stream Api";
		
		String reverse = IntStream.range(0, str.length())
				.mapToObj(i -> String.valueOf(str.charAt(str.length() - 1 - i)))
	            .reduce("", String::concat);
		
		System.out.println(reverse);
	}

}
