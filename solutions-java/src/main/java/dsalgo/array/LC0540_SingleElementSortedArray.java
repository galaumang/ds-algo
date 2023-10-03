package dsalgo.array;

public class LC0540_SingleElementSortedArray {
  public int singleNonDuplicate(int[] nums) {
    int n = nums.length;
    if (n == 1)
      return nums[0];

    for (int i = 0, j = 1; i < n - 1; i += 2) {
      if (nums[i] != nums[j]) {
        return nums[i];
      }
      j += 2;
    }
    return nums[n - 1];
  }
}
