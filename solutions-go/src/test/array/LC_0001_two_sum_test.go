package array;

import (
    "reflect"
    "testing"
    "solutions-go/src/main/array"
)

func TestTwoSum(t *testing.T) {
    tests := []struct {
        nums     []int
        target   int
        expected []int
    }{
        {nums: []int{2, 7, 11, 15}, target: 9, expected: []int{0, 1}},
        {nums: []int{3, 2, 4}, target: 6, expected: []int{1, 2}},
        {nums: []int{3, 3}, target: 6, expected: []int{0, 1}},
        {nums: []int{1, 2, 3}, target: 7, expected: nil},
    }

    for _, test := range tests {
        result := array.TwoSum(test.nums, test.target)
        if !reflect.DeepEqual(result, test.expected) {
            t.Errorf("TwoSum(%v, %d) = %v; expected %v", test.nums, test.target, result, test.expected)
        }
    }
}
