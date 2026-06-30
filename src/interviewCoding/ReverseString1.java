package interviewCoding;

//Method 1: Using for Loop

public class ReverseString1 {
	
	public static void main(String[] args) {
		
	

	String str = "MultiThreading";
	
	String reverse = "";
	
	
	for( int i = str.length() - 1; i>= 0; i--) {
		reverse = reverse + str.charAt(i);
	}
	
	System.out.println("original String : " + str);
	System.out.println("Reversed String : " + reverse);
	
}
}