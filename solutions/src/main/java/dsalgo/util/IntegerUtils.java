package dsalgo.util;

/**
 * IntegerUtils
 * <p>
 * Utilities on Integers or primitive int
 * - maximum (of three int)
 * - minimum (of three int)
 * </p>
 *
 * @author Umang G
 */
public class IntegerUtils {
    /**
     * <p>{@code IntegerUtils} instance should NOT be constructed in standard
     * programming, so its defined as private</p>
     */
    private IntegerUtils() {
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
