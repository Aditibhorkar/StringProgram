package Day1;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {

		String str = new String("god");
		String str1 = new String("dog");
		char[]i=str.toCharArray();
		char[]j=str1.toCharArray();
	
		Arrays.sort(j);
		Arrays.sort(i);
		int j2;
		for ( j2 = 0; j2 < j.length; j2++) {
			if (i[j2]!=j[j2]) {
				break;
			}
		}
		if (j2==i.length) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an anagram");
		}	}

}
