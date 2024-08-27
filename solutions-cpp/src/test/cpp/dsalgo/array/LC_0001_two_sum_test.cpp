#include <gtest/gtest.h>

// Function to find two numbers in a vector that add up to a target
std::vector<int> twoSum(const std::vector<int>& nums, int target);

TEST(TwoSumTest, BasicTest) {
    std::vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    std::vector<int> expected = {0, 1};
    EXPECT_EQ(twoSum(nums, target), expected);
}

TEST(TwoSumTest, NoSolution) {
    std::vector<int> nums = {1, 2, 3};
    int target = 6;
    std::vector<int> expected = {};
    EXPECT_EQ(twoSum(nums, target), expected);
}

TEST(TwoSumTest, MultiplePairs) {
    std::vector<int> nums = {3, 2, 4, 6};
    int target = 6;
    std::vector<int> expected = {1, 2};
    EXPECT_EQ(twoSum(nums, target), expected);
}
