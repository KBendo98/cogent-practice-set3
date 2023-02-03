package exercises3;

import java.util.LinkedHashSet;
import java.util.Set;

public class AllSubstrings {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(findAllSubstrings(s));
	}
	
	public static Set<String> findAllSubstrings(String s){
		// A set will only store the unique substrings, so no repetitions
		Set<String> resultList = new LinkedHashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				resultList.add(s.substring(i,j));
			}
		}
		
		return resultList;
	}
}
