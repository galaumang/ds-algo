package dsalgo.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumEvenSplitTest {
    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(12l, new LinkedList<Long>(Arrays.asList(2l, 4l, 6l))),
                Arguments.of(7l, new LinkedList<Long>(Arrays.asList())));
    }

    @ParameterizedTest(name = "{index} > {0} >")
    @MethodSource("testCases")
    void testMaximumEvenSplit(long input, List<Long> expected) {
        assertEquals(expected, MaximumEvenSplit.maximumEvenSplit(input));
    }
}