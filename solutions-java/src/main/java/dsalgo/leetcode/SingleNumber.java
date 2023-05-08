package dsalgo.leetcode;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int no = 0;
        for (int num : nums) {
            no ^= num;
        }
        return no;
    }
}
