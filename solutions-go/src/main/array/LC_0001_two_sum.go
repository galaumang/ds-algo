package array;

func TwoSum(nums []int, target int) []int {
    numMap := make(map[int]int)
    for i, num := range nums {
        if j, ok := numMap[target-num]; ok {
            return []int{j, i}
        }
        numMap[num] = i
    }
    return nil
}
