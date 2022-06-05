package Sort;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        Integer[] a = {4,6,3,5,2,1};
        BubbleSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
