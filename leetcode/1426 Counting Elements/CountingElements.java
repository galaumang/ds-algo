public class CountingElements {
    /**
    * countElements
    * count the element x such that x + 1 element is present in the same array
    *
    * @param arr array elements
    * @return count of x elements
    */
    public static int countElements(int[] arr) {
        int count = 0;
        Set<Integer> elements = new HashSet<>();
        for (int element : arr)
            elements.add(element);
        for (int x : arr)
            if (elements.contains(x + 1))
                count++;
        return count;
    }
}