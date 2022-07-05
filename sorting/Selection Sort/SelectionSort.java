public class SelectionSort {
    public static void sort(int[] elements) {
        int minimum;
        int minimumIndex;
        for (int element = 0; element < elements.length - 1; element++) {
            minimum = elements[element];
            minimumIndex = element;
            for (int index = element + 1; index < elements.length; index++) {
                if (elements[index] < minimum) {
                    minimum = elements[index];
                    minimumIndex = index;
                }
            }
            int temporary = array[element];
            array[element] = array[minimumIndex];
            array[minimumIndex] = temporary;
        }
    }
}
