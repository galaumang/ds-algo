package dsalgo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * ArrayUtilsTest
 *
 * @author Umang G
 */
class ArrayUtilsTest {
    @Test
    void swapArrayElementsIntTest() {
        int[] array = new int[]{2, 7, 11, 15};
        ArrayUtils.swapArrayElements(array, 1, 2);
        assertEquals(11, array[1]);
    }

    @Test
    void swapArrayElementsCharTest() {
        char[] array = new char[]{'b', 'd', 'u', 's'};
        ArrayUtils.swapArrayElements(array, 1, 2);
        assertEquals('u', array[1]);
    }

    @Test
    void reverseTest() {
        int[] array = new int[]{2, 7, 11, 15};
        ArrayUtils.reverse(array, 1, 3);
        assertArrayEquals(new int[]{2, 15, 11, 7}, array);
    }

    @Test
    void reverseNoElementTest() {
        int[] array = new int[]{2, 7, 11, 15};
        ArrayUtils.reverse(array, 3, 1);
        assertArrayEquals(new int[]{2, 7, 11, 15}, array);
    }
}