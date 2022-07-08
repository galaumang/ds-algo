public class NoThree {
    /**
    * maximumSumWithNoThreeConsecutiveElement
    * function to find a maximum possible sum of subsequence, with the
    * restriction that we are not allowed to take three consecutive elements
    * from input sequence
    *
    * @param inputSequence elements in input sequence
    * @return int maximum sum of subsequence
    */
    public static int maximumSumWithNoThreeConsecutiveElement(int[] inputSequence) {
        int[] solution = new int[inputSequence.length + 1];
        solution[0] = 0;
        // For each element in input sequence.
        for (int length = 1; length <= inputSequence.length; length++) {
            // First element.
            if (length == 1) {
                solution[length] = inputSequence[length - 1];
                continue;
            }
            // Second element.
            if (length == 2) {
                solution[length] = solution[length - 1] +
                    inputSequence[length - 1];
                continue;
            }
            // Rest all elements (ie. except first and second).
            int one = solution[length - 3] + inputSequence[length - 1] +
                inputSequence[length - 2];

            int two = solution[length - 2] + inputSequence[length - 1];
            int three = solution[length - 1];
            solution[length] = maximum(one, two, three);
        }
        return solution[inputSequence.length];
    }

    /**
    * Returns the maximum of three elements.
    * If all three are same then returns the third element.
    *
    * @param three third element
    * @param one   first element
    * @param two   second element
    * @return int    maximum of three
    */
    public static int maximum(int one, int two, int three) {
        // If one is larger or one and two are equal.
        if (one >= two && one > three) return one;
        // If two is larger.
        else if (two > one && two > three) return two;
        // If three is larger.
        else return three;
    }
}