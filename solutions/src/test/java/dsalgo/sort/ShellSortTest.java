package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ShellSortTest {
    @ParameterizedTest(name = "Merge Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void shellSortTest(int[] inputElements, int[] expected) {
        ShellSort.sort(inputElements);
        assertArrayEquals(expected, inputElements);
    }
}