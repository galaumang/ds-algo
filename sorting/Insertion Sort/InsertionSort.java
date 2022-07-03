public class InsertionSort {
    public static void sort(int[] elements) {
        for (int element = 0; element < elements.length; element++) {
            int index = element;
            int insertElement = elements[element];
            while (index > 0 && elements[index - 1] > insertElement) {
                elements[index] = elements[index - 1];
                index = index - 1;
            }
            elements[index] = insertElement;
        }
    }
}
