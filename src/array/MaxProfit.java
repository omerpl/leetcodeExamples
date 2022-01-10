package array;

public class MaxProfit {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5};
		int k = getMaxProfit(nums);

		System.out.println(k);
	}


	public static int getMaxProfit(int[] prices) {
		int acc = 0;
		int priceBought = 0;
		boolean haveIt = false;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > priceBought && haveIt) {
				acc += prices[i] - priceBought;
				haveIt = false;
			}
			if (i != prices.length - 1) {
				priceBought = prices[i];
				haveIt = true;
				if (prices[i] > prices[i + 1]) {
					haveIt = false;
				}
			}

		}
		return acc;
	}
}
