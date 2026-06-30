package interviewCoding;

//Using StringBuilder
public class ReverseEachWord1 {
	
	public static void main(String[] args) {
		
		String str = "Java Spring Boot";

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reverse = new StringBuilder(word);

            result.append(reverse.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());

	}

}
