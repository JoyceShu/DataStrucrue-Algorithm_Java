package Sort;

public class MergeSort {
    private static Comparable[] assist;

    /*
    comparable if v < w
    */

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0 ;
    }

    private static void swap(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    /*
    sorting elements from array i;
    * */

    public static void sort(Comparable[] a){
        //1. init assist[]
        assist = new Comparable[a.length];

        //2. define variable low and variable high,分别记录数组中最小的索引和最大的索引
        int low = 0;
        int high = a.length - 1;

        //3. call sort()
        sort(a, low, high);
    }

    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low){
            return;
        }
        //对low和high之前的数据进行分组-》从中间开始分
        int mid = low + (high - low) /2;


        //对每一组数据排序
        sort(a, low, mid);
        sort(a, mid + 1, high);

        //把两个组中的数据merge到一起
        merge(a, low, mid, high);

    }
    private static void merge(Comparable[]a, int low, int mid, int high){
        //init 3 pointers
        int i = low;
        int p1 = low;
        int p2 = mid + 1;

        while(p1 <= mid && p2 <= high) {
            //compare value
            if (less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else{
                assist[i++] = a[p2++];
            }
        }

        while(p1 <= mid){
            assist[i++] = a[p1++];
        }
        while(p2 <= high){
            assist[i++] = a[p2++];
        }

        for (int index = low; index <= high ; index++) {
            a[index] = assist[index];
        }
    }

}
