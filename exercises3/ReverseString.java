package exercises3;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Java is cool";
		String reversed = reverseString(s);
		
		System.out.println("Original: " + s);
		System.out.print("Reversed: " + reversed); 
	}
	
	public static String reverseString(String s) {
		StringBuilder sBuilder = new StringBuilder(s);
		
		return sBuilder.reverse().toString();
	}
}
