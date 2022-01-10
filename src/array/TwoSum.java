package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 4, 6, 5};
		int target = 6;
		int[] result = twoSum(nums, target);
		System.out.println(result);
	}


	public static int[] twoSum(int[] nums, int target) {
		String numsStr = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(","));
		int searchFor;
		for (int i = 0; i < nums.length - 1; i++) {
			searchFor = target - nums[i];
			if (numsStr.contains("," + String.valueOf(searchFor))) {
				for (int j = i + 1; j < nums.length; j++) {
					if (searchFor == nums[j]) {
						return new int[] {i, j};
					}
				}
			}
		}

		return null;
	}
}
