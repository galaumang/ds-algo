package dsalgo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * IntegerUtilsTest
 *
 * @author Umang G
 */
class IntegerUtilsTest {
    @Test
    void maximumTest() {
        assertEquals(9, IntegerUtils.maximum(1, 2, 9));
        assertEquals(2, IntegerUtils.maximum(1, 2, 0));
        assertEquals(9, IntegerUtils.maximum(2, 9, 1));
        assertEquals(9, IntegerUtils.maximum(9, 1, 2));
        assertEquals(18, IntegerUtils.maximum(9, 1, 18));
    }

    @Test
    void minimumTest() {
        assertEquals(2, IntegerUtils.minimum(18, 2, 9));
        assertEquals(2, IntegerUtils.minimum(2, 9, 18));
        assertEquals(1, IntegerUtils.minimum(9, 2, 1));
        assertEquals(2, IntegerUtils.minimum(9, 18, 2));
    }
}