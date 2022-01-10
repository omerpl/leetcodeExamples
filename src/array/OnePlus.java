package array;

public class OnePlus {
	public static void main(String[] args) {
		int[] nums = new int[] {9};
		int[] result = plusOne(nums);

		System.out.println(nums);
	}


	public static int[] plusOne(int[] digits) {
		int lastVal = digits[digits.length - 1] + 1;
		boolean elde = lastVal > 9;
		digits[digits.length - 1] = lastVal % 10;
		int acc = 0;
		if (elde) {

			for (int i = digits.length - 2; i >= 0; i--) {
				acc = digits[i] + 1;
				elde = acc > 9;
				digits[i] = acc % 10;
				if (!elde) {
					break;
				}
			}
		}

		if (elde) {
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			System.arraycopy(digits, 0, result, 1, digits.length);
			return result;
		}

		return digits;

	}
}
