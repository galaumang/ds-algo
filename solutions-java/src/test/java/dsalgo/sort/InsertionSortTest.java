package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class InsertionSortTest {
    @ParameterizedTest(name = "Insertion Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void insertionSortTest(int[] inputElements, int[] expected) {
        InsertionSort.sort(inputElements);
        assertArrayEquals(expected, inputElements);
    }
}