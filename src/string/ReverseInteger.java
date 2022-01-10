package string;

import javax.swing.ImageIcon;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 123;

		int reveresed = reverse(num);

		System.out.println(reveresed);


	}

	public static int reverse(int x) {

		int multiplier = x < 0 ? -1 : 1;
		x = Math.abs(x);
		char[] str = String.valueOf(x).toCharArray();
		reverseString(str);

		try {
			return Integer.parseInt(String.valueOf(str)) * multiplier;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public static void reverseString(char[] s) {
		char temp;
		for (int i = 0; i < s.length / 2; i++) {
			temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}


}
