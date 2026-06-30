package interviewCoding;

public class ReverseString3 {

	
	//Using Character Array
	
	public static void main(String[] args) {
		
		String str = "FullStack";
		
		char[] ch = str.toCharArray();
		
		for(int i = ch.length -1; i >= 0; i--){
			
			System.out.println(ch[i]);
		}
	}
}
