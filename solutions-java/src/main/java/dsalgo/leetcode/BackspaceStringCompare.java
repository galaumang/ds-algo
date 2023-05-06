package dsalgo.leetcode;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int backS = 0, backT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    backS++;
                    i--;
                } else if (backS > 0) {
                    backS--;
                    i--;
                } else
                    break;
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    backT++;
                    j--;
                } else if (backT > 0) {
                    backT--;
                    j--;
                } else
                    break;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            if ((i >= 0) != (j >= 0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}
