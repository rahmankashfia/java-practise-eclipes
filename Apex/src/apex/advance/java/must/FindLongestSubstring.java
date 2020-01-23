package apex.advance.java.must;

import java.util.HashSet;

public class FindLongestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> hSet = new HashSet<Character>();
		String str = "abcdefabe";
		int startIndex = -1;
		int endIndex = -1;
		int j = 0;
		//int k = 0;
		int maxLength = 0;
		for(int i = 0; i < str.length(); i++) {
			char cTemp = str.charAt(i);
			System.out.println(cTemp);
			if (hSet.contains(cTemp)) {
				if (str.charAt(j) == cTemp) {
					j++;
				} else {
					while (true) {
						j++;
						if (str.charAt(j) == cTemp) {
							j++;
							break;
						}
					}
				}
			} else {
				hSet.add(cTemp);
			}
			if (maxLength <= (i - j + 1)) {
				maxLength = i - j + 1;
				startIndex = j;
				endIndex = i;	
			}
			System.out.println(hSet);
		}
		System.out.println("Longest substring length: " + maxLength);
		System.out.println("Start index: " + startIndex);
		System.out.println("End index: " + endIndex);
		System.out.println("String: " + str.substring(startIndex, endIndex+1));
		
	}
}
