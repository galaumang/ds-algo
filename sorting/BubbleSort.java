public class BubbleSort {
    public static void sort(int[] elements) {
        for (int element = elements.length - 1; element >= 0; element--) {
            for (int index = 0; index < element; index++) {
                if (elements[index] > elements[index + 1]) {
                    int temporary = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temporary;
                }
            }
        }
    }
}
