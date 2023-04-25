package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MergeSortTest {
    @ParameterizedTest(name = "Merge Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void mergeSortTest(int[] inputElements, int[] expected) {
        MergeSort.sort(inputElements, 0, inputElements.length-1);
        assertArrayEquals(expected, inputElements);
    }
}