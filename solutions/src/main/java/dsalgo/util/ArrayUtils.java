package dsalgo.util;

/**
 * ArrayUtils
 * <p>
 * Utilities on primitive arrays
 * - swapArrayElements (int)
 * - swapArrayElements (char)
 * - reverse (int)
 * </p>
 *
 * @author Umang G
 */
public class ArrayUtils {
    /**
     * <p>{@code ArrayUtils} instance should NOT be constructed in standard
     * programming, so its defined as private</p>
     */
    private ArrayUtils() {
    }

    /**
     * Swap the given two element in an given array.
     *
     * @param array    array of elements
     * @param indexOne element to be swapped
     * @param indexTwo element to be swapped with
     */
    public static void swapArrayElements(int[] array, int indexOne, int indexTwo) {
        int temporary = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temporary;
    }

    /**
     * Swap the given two element in an given array.
     *
     * @param array    array of elements
     * @param indexOne element to be swapped
     * @param indexTwo element to be swapped with
     */
    public static void swapArrayElements(char[] array, int indexOne, int indexTwo) {
        char temporary = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temporary;
    }

    /**
     * Reverse the array elements between start and end (inclusive) range.
     *
     * @param array elements
     * @param start starting index
     * @param end   ending index
     */
    public static void reverse(int[] array, int start, int end) {
        while (end > start) {
            int swapElement = array[start];
            array[start] = array[end];
            array[end] = swapElement;
            start++;
            end--;
        }
    }
}
