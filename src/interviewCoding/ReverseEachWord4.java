package interviewCoding;

public class ReverseEachWord4 {
	
	public static void main(String[] args) {
		
		String  str =  "Java Spring Boot";
		
		StringBuilder word = new StringBuilder();
		
		 for ( int i = 0; i < str.length(); i++) {
			 
			 char ch = str.charAt(i);
			 
			 if(ch != ' ') {
				 word.append(ch);
			 }else {
				 System.out.println(word.reverse() + " ");
				 word.setLength(0);
			 }
		 }
		 
		 System.out.println(word.reverse());
	}

}
