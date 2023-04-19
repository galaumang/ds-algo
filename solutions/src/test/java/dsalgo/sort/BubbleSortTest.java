package dsalgo.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BubbleSortTest {
    @ParameterizedTest(name = "Bubble Sort - {index} > {0} > ")
    @MethodSource("dsalgo.sort.SortTestCases#testCases")
    void bubbleSortTest(int[] inputElements, int[] expected) {
        BubbleSort.sort(inputElements);
        assertArrayEquals(expected, inputElements);
    }
}