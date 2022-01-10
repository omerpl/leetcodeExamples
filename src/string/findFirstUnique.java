package string;

import java.util.HashMap;
import java.util.Map;

public class findFirstUnique {
	public static void main(String[] args) {
		String str = "leetcode";
		int idx = firstUniqChar(str);

		System.out.println(str);


	}

	public static int firstUniqChar(String s) {
		Map<Character, Integer> idxHolder = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (idxHolder.get(s.charAt(i)) != null) {
				idxHolder.put(s.charAt(i), -1);
			} else {
				idxHolder.put(s.charAt(i), i);
			}
		}

		int firstIdx = s.length();

		for (Character c : idxHolder.keySet()) {
			if (idxHolder.get(c) != -1) {
				firstIdx = firstIdx > idxHolder.get(c) ? idxHolder.get(c) : firstIdx;
			}
		}
		return firstIdx == s.length() ? -1 : firstIdx;
	}


}
