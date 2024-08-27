#include <gtest/gtest.h>
#include <string>

// Function to find the first non-repeating character in a string
int firstUniqChar(std::string s);

TEST(FirstUniqCharTest, BasicCases) {
    EXPECT_EQ(firstUniqChar("leetcode"), 0);   // 'l' is the first unique character
    EXPECT_EQ(firstUniqChar("loveleetcode"), 2);  // 'v' is the first unique character
    EXPECT_EQ(firstUniqChar("aabbcc"), -1);   // No unique character, expect -1
    EXPECT_EQ(firstUniqChar("abcabc"), -1);   // No unique character, expect -1
    EXPECT_EQ(firstUniqChar("z"), 0);         // Single character, expect index 0
}

TEST(FirstUniqCharTest, EdgeCases) {
    EXPECT_EQ(firstUniqChar(""), -1);         // Empty string, expect -1
    EXPECT_EQ(firstUniqChar("aabb"), -1);     // No unique character, expect -1
    EXPECT_EQ(firstUniqChar("ab"), 0);        // 'a' is the first unique character
    EXPECT_EQ(firstUniqChar("aab"), 2);       // 'b' is the first unique character
}
