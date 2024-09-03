package strings;

import (
    "testing"
    "solutions-go/src/main/strings"
)

func TestFirstUniqChar(t *testing.T) {
    tests := []struct {
        input string
        expected int
    }{
        {input: "leetcode", expected: 0},
        {input: "loveleetcode", expected: 2},
        {input: "aabb", expected: -1},
        {input: "abcdefg", expected: 0},
        {input: "aabbccddeeffg", expected: 12},
        {input: "", expected: -1},
    }

    for _, test := range tests {
        result := strings.FirstUniqChar(test.input)
        if result != test.expected {
            t.Errorf("FirstUniqChar(%s) = %d; expected %d", test.input, result, test.expected)
        }
    }
}
