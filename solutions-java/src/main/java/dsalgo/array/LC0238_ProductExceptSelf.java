package dsalgo.array;

public class LC0238_ProductExceptSelf {
  public int[] productExceptSelf(int[] nums) {
    int l = nums.length;
    int[] ans = new int[l];
    ans[0]=1;
    for (int i=1;i<l;i++)
        ans[i] = nums[i-1] * ans[i-1];
    int rightProduct=1;
    for (int i=l-1; i>=0; i--){
        ans[i] = ans[i] * rightProduct;
        rightProduct *= nums[i];
    }
    return ans;
  }
}
