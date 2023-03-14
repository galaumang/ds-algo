class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int current = Integer.MIN_VALUE;
        int maximum = Integer.MIN_VALUE;
        
        for ( int num : nums) {
            current = Math.max(0, current);
            current += num;
            maximum = Math.max(maximum, current);
        }
        return maximum;
    }
}
