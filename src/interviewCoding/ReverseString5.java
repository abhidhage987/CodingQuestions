package interviewCoding;

public class ReverseString5 {
	
	// Using Recursion
	
	
	public static void reverse(String str) {
		if(str.isEmpty()) {
			return;
		}
		
		reverse(str.substring(1));
		System.out.println(str.charAt(0));

	}
	
	public static void main(String[] args) {
		
		reverse("Computer Appliaction");
	}

}
