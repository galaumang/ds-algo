package dsalgo.array;

import java.util.Arrays;

public class LC2172_MaximumANDSumArray {
  public int maximumANDSum(int[] nums, int numSlots) {
		int n = 2 * numSlots;
		int nSelected = 1 << n;

		int[] dp = new int[nSelected];
		int[] nos = Arrays.copyOf(nums, n);

		for(int mask = 1; mask < nSelected; ++mask) {
			int selected = Integer.bitCount(mask);
			int slot = (selected + 1)/2;

			for ( int i = 0; i < n; ++i) {
				if ((mask >> i & 1) == 1) {
				dp[mask] = Math.max(dp[mask],dp[mask ^ 1 << i]+(slot & nos[i]));
				}
			}
		}
		return dp[nSelected - 1];
    }
}
