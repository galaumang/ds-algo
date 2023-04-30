package dsalgo.dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StringConvertTest {
    private static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of("beard", "bored", 9),
            Arguments.of("ababababababa", "abcabcabcabc", 21),
            Arguments.of("winter", "spring", 23)
        );
    }
    
    @ParameterizedTest(name = "{index} > {0}, {1} > ")
    @MethodSource("testCases")
    void testConvertString(String toConvert, String toMatch, int cost) {
        assertEquals(cost, StringConvert.convertString(toConvert, toMatch));
    }
}
