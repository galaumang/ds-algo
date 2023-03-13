class Solution {
    int numSquareSum(int no) {
        int squareSum = 0;
        while (no != 0) {
            int digit = no % 10;
            squareSum += (digit * digit);
            no /= 10;
        }
        return squareSum;
    }

    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        } while (slow != fast);
        return (slow == 1);
    }
}
