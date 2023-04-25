package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SelectionSortTest {
    @ParameterizedTest(name = "Selection Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void selectionSortTest(int[] inputElements, int[] expected) {
        SelectionSort.sort(inputElements);
        assertArrayEquals(expected, inputElements);
    }
}