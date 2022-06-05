package Sort;

public class QuickSort {
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    private static void swap(Comparable[]a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void sort(Comparable[]a ){
        int low = 0;
        int high = a.length - 1;
        sort(a, low, high);

    }
    private static void sort(Comparable[]a, int low, int high){
        if(high <= low){
            return;
        }

        //需要对数组中low的索引出的元素进行分组，（左边&右边）
        int partition = partition(a, low, high);//返回的分组分界值得index
        sort(a, low, partition -1);
        sort(a, partition + 1,high);


    }
    private static int partition(Comparable[] a, int low, int high){
        //init the pivot value
        Comparable pivotVal = a[low];

        //init two pointer
        int left = low;
        int right = high + 1;
        while(true){
            //partition
            //先从right--》left扫描，找到一个比pivotVal小的值，pause
            while(less(pivotVal, a[--right])){
                if(right == low){
                    break;
                }
            }
            //从left -》right，找到一个比pivotVal大的值，pause
            while(less(a[++left], pivotVal)){
                if(left == high){
                    break;
                }
            }
            //swap
            if(left >= right){
                break;
            }else{
                swap(a, left, right);
            }

        }
        swap(a, low, right); //swap pivotValue

        return right;
    }
}
