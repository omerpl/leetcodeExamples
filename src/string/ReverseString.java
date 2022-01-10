package string;

public class ReverseString {
	public static void main(String[] args) {
		char[] str = "hello".toCharArray();
		reverseString(str);

		System.out.println(str);


	}

	public static void reverseString(char[] s) {
		char temp;
		for (int i = 0; i < s.length / 2; i++) {
			temp = s[i];
			s[i] = s[s.length -1 - i];
			s[s.length -1 - i] = temp;
		}
	}


}
