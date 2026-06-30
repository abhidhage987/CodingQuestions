package interviewCoding;


//Using split() + for loop
public class ReverseEachWord {
	public static void main(String[] args) {
		
		String str = " Java Spring Boot";
		
		String[] words = str.split(" ");
		
		String result = "";
		
		for (String word : words) {
			
			String reverse = "";
			
			for (int i = word.length() - 1; i >= 0; i--) {
				reverse += word.charAt(i);
			}
			
			result += reverse + " ";
			
		}
		
		System.out.println("Original String : " + str);
		
		System.out.println("Modified String : " + result.trim());
	}

}
