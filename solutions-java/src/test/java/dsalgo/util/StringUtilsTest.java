package dsalgo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * StringUtilsTest
 *
 * @author Umang G
 */
class StringUtilsTest {
    @Test
    void checkAllUniqueTrueTest() {
        assertTrue(StringUtils.checkAllUnique("something", 1, 3));
    }

    @Test
    void checkAllUniqueFalseTest() {
        assertFalse(StringUtils.checkAllUnique("stringutil", 3, 9));
    }
}
