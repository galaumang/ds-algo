public class StringConvert {
    /**
    * convertString
    * function to convert string X into string Y at minimal cost.
    *
    * @param toConvert string X to be converted
    * @param toMatch   string Y to match with
    * @return minimum conversion cost
    */
    public static int convertString(String toConvert, String toMatch) {
        int[][] solution = new int[toConvert.length() + 1][toMatch.length() + 1];
        int removeCost = 3;
        int insertCost = 4;
        int replaceCost = 5;

        for (int lengthY = 0; lengthY <= toMatch.length(); lengthY++) {
            for (int lengthX = 0; lengthX <= toConvert.length(); lengthX++) {
                if (lengthY == 0) {
                    solution[lengthX][0] = lengthX * removeCost;
                    continue;
                }
                if (lengthX == 0) {
                    solution[0][lengthY] = lengthY * insertCost;
                    continue;
                }
                if (toConvert.charAt(lengthX - 1) == toMatch.charAt(lengthY - 1)) {
                    solution[lengthX][lengthY] = solution[lengthX - 1][lengthY - 1];
                    continue;
                }
                int ifRemoved = solution[lengthX - 1][lengthY] + removeCost;
                int ifInserted = solution[lengthX][lengthY - 1] + insertCost;
                int ifReplaced = Integer.MAX_VALUE;
                if (lengthX > 1) {
                    ifReplaced = solution[lengthX - 2][lengthY - 1] + replaceCost;
                }
                solution[lengthX][lengthY] = minimum(ifRemoved, ifInserted, ifReplaced);
            }
        }
        return solution[toConvert.length()][toMatch.length()];
    }

    /**
    * Returns the minimum of three elements.
    * If all three are same then returns the third element.
    *
    * @param one   first element
    * @param two   second element
    * @param three third element
    * @return int    minimum of three
    */
    public static int minimum(int one, int two, int three) {
        // If one is smaller or one and two are equal.
        if (one <= two && one < three) return one;
        // If two is smaller.
        else if (two < one && two < three) return two;
        // If three is smaller.
        else return three;
    }
}