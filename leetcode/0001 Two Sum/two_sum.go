func twoSum(nums []int, target int) []int {
    noMap := make(map[int]int)
    for index, no := range nums {
        if i, ok:= noMap[target-no]; ok {
            return []int{i, index}
        }
        noMap[no] = index
    }
    return nil
}
