package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class HeapSortTest {
    @ParameterizedTest(name = "Heap Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void heapSortTest(int[] inputElements, int[] expected) {
        HeapSort.sort(inputElements);
        assertArrayEquals(expected, inputElements);
    }
}
