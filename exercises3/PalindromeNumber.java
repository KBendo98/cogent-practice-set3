package exercises3;

public class PalindromeNumber {

	public static void main(String[] args) {
		int test = 21312;
		
		System.out.println("Palindrome: " + isPalindrome(test));
	}
	
	public static boolean isPalindrome(Integer num) {
		String original = num.toString();
		String reversed = new StringBuilder(original).reverse().toString();	
		
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
		
		if(original.equals(reversed))
			return true;
		return false;
	}
}
