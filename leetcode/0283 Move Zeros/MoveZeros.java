class MoveZeros {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for (int num : nums) {
            if (num != 0) 
                nums[nonZeroIndex++] = num;
        }
        while (nonZeroIndex < nums.length)
            nums[nonZeroIndex++] = 0;
    }
}
