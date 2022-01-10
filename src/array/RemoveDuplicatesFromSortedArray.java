package array;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 4, 32, 32, 435, 21512};
		int k = removeDuplicates(nums);

		System.out.println(k);


	}


	public static int removeDuplicates(int[] nums) {
		int acc = -101;
		int idx = 0;
		for (int num : nums) {
			if (num > acc) {
				acc = num;
				nums[idx] = acc;
				idx += 1;
			}
		}
		int[] output = new int[idx];

		for (int i = 0; i < idx; i++) {
			output[i] = nums[i];
		}
		nums = output;
		return idx;
	}
}
