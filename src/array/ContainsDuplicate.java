package array;

import java.util.Arrays;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 4, 32, 32, 435, 21512};
		boolean result = containsDuplicate(nums);

		System.out.println(result);


	}

	public static boolean containsDuplicate(int[] nums) {
		Integer distinctlen = Arrays.stream(nums)
									.distinct()
									.map(operand -> 1)
									.sum();
		return distinctlen != nums.length;

	}
}
