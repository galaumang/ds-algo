package dsalgo.util;

import java.util.HashSet;
import java.util.Set;

/**
 * StringUtils
 * <p>
 * Operations on String
 * - checkAllUnique
 * </p>
 *
 * @author Umang G
 */
public class StringUtils {
    /**
     * <p>{@code StringUtils} instance should NOT be constructed in standard
     * programming, so its defined as private</p>
     */
    private StringUtils() {
    }

    /**
     * Checks for all characters from start to end index in the string are unique
     *
     * @param str   string
     * @param start start index of character
     * @param end   end index of the character
     * @return true if all characters from start and end index in the string are
     * unique else false
     */
    public static boolean checkAllUnique(String str, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int index = start; index < end; index++) {
            Character character = str.charAt(index);
            if (!set.add(character))
                return false;
        }
        return true;
    }
}