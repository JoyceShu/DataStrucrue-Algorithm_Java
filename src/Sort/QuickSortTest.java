package Sort;

import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        Integer[] a = {6, 1, 3, 4, 2, 5, 8, 9, 7};
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
