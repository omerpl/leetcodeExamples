package array;

public class ShiftArray {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5,6,7};
		rotate(nums, 3);

		System.out.println(nums);
	}

	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		int shiftAmount = k % len;
		int[] part = new int[k];
		for (int i = 0; i < shiftAmount; i++) {
			part[i] = nums[len - 1 - shiftAmount + i ];
		}
		for (int i = len - shiftAmount -1; i >= 0 ; i--) {
			nums[i + shiftAmount] = nums [i];
		}
		for (int i = 0; i < shiftAmount ; i++) {
			nums[i] = part[i];
		}
	}


}
