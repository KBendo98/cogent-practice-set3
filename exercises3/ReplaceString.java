package exercises3;

public class ReplaceString {

	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.println("Old: " + str);
		
		str = replaceString(str, "Hello", "Bye");
		System.out.println("New: " + str);
	}
	
	public static String replaceString(String s, String oldString, String newString) {
		return s.replace(oldString, newString);
	}
}
