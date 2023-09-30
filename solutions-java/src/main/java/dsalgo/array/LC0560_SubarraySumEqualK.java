package dsalgo.array;

public class LC0560_SubarraySumEqualK {
  public int subarraySum(int[] nums, int k) {
    int ans = 0;
    for (int start = 0; start < nums.length; start++) {
      int sum=0;
      for (int end = start; end < nums.length; end++) {
        sum+=nums[end];
        if (sum == k)
          ans++;
      }
    }
    return ans;
  }
}
