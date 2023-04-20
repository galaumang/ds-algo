package dsalgo.sort;

/**
 * ShellSort
 *
 * @author Umang G
 */
public class ShellSort {
    /**
     * <p>{@code ShellSort} instance should NOT be constructed in standard
     * programming, so its defined as private</p>
     */
    private ShellSort() {
    }

    /**
     * Shell sort algorithm
     *
     * @param elements elements to sort
     */
    public static void sort(int[] elements) {
        int noOfElements = elements.length;
        int gap = noOfElements / 2;
        while (gap != 0) {
            for (int index = gap; index < noOfElements; index++) {
                int element = elements[index];
                int j = index;
                while (j > gap - 1 && elements[j - gap] > element) {
                    elements[j] = elements[j - gap];
                    j = j - gap;
                }
                elements[j] = element;
            }
            gap /= 2;
        }
    }
}