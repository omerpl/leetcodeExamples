package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = new int[] {-336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101, -997, 40,
			-527, -784, -283, 354};
		int result = doesHaveSingleNumber(nums);

		System.out.println(result);


	}

	public static int doesHaveSingleNumber(int[] nums) {

		int xor = 0;

		for (int num: nums) {
			xor ^= num;
		}

		return xor;

	}
}
