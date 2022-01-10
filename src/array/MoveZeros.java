package array;

public class MoveZeros {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 0, 0, 2, 0, 9};
		int[] result = moveZeroes(nums);

		System.out.println(nums);
	}


	public static int[] moveZeroes(int[] digits) {
		int zeroCount = 0;
		int processIndex = 0;
		for (int i = 0; i < digits.length; i++) {

			if (digits[i] == 0) {
				zeroCount += 1;
				processIndex -= 1;
			}else{
				digits[processIndex] = digits[i];
			}
			processIndex += 1;
		}
		for(int i = digits.length -1 ; i >= digits.length- zeroCount ; i-- ){
			digits[i]= 0;
		}
		return digits;
	}
}
