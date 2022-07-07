class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index]))
                return new int[]{map.get(nums[index]), index};
            else
                map.put(target - nums[index], index);
        }
        return new int[]{-1, -1};
    }
}