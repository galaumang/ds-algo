package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class QuickSortTest {
    @ParameterizedTest(name = "Quick Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void quickSortTest(int[] inputElements, int[] expected) {
        QuickSort.sort(inputElements, 0, inputElements.length-1);
        assertArrayEquals(expected, inputElements);
    }
}