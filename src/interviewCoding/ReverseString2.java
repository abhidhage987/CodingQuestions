package interviewCoding;

public class ReverseString2 {

	//Using StringBuilder
	
	public static void main(String[] args) {
		
		String str = "Exception" ;
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
	}
}
