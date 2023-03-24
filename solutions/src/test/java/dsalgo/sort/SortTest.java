package dsalgo.sort;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class SortTestCases {
    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{23, 38, 19, 1, 22}, new int[]{1, 19, 22, 23, 38}),
                Arguments.of(new int[]{4, 3, 8, 9, -2, 6, 10, 13, 4, 5, -9, 0, -2}, new int[]{-9, -2, -2, 0, 3, 4, 4, 5, 6, 8, 9, 10, 13})
        );
    }
}