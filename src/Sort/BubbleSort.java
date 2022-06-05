package Sort;

public class BubbleSort {
    public static void sort(Comparable[] a){
        for (int i = a.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                //比较index j and index j + 1；
                if (greater(a[j],a[j+1])){
                    swap(a, j, j+1);
                }
            }
        }
    }
    public static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    public static void swap(Comparable[]a, int i, int j){
        Comparable tmp;
        tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
