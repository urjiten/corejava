package string.anagramcheck;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		
		
		

		String s1 = "madam PURNA";
		String s2 = "damam ANRUP";

		if (s1.length() != s2.length()) {

			System.out.println("Not Anagram");
		} else {

			String ss1 = s1.replaceAll("\\s+", "").toLowerCase();
			String ss2 = s2.replaceAll("\\s+", "").toLowerCase();
			
			System.out.println(ss1);
			System.out.println(ss2);
			
			
			char[] ss1a = ss1.toCharArray();
			char[] ss2a = ss2.toCharArray();

			Arrays.sort(ss1a);
			Arrays.sort(ss2a);
			System.out.println(ss1a);
			System.out.println(ss2a);

			boolean isAnagram = Arrays.equals(ss1a, ss2a);

			if (isAnagram) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
		
		

	}

}
