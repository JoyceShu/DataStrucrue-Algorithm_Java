package Heap;

public class Heap <T extends Comparable<T>>{
    //store elements in heaps
    private T[] items;
    private int N;

    private Heap(int capacity){
        items = (T[]) new Comparable[capacity + 1];
        N = 0;
    }
    //判断idx i处的元素是否小于idx j处的元素
    private boolean less(int i, int j){
        return items[i].compareTo(items[j])<0;
    }

    //swap i & j
    private void swap(int i, int j){
        T tmp = items[j];
        items[i] = items[j];
        items[j] = tmp;
    }

    public void insert(T t){
        items[++N] = t;
        swim(N);

    }
    public void swim(int k){
        while (k > 1){
            if(less(k/2, k)){
                swap(k/2, k);
            }
            k = k/2;
        }
    }
    public T delMax(){
        T max = items[1];
        swap(1, N);
        items[N] = null;
        N--;
        return max;
    }

    public void sink(int k){
        while(2*k <= N){
            int max;
            if (2*k + 1<= N){
                //比较左右节点的大小
                if (less(2*k,2*k+1 )){
                    max=2*k+1;
                }else{
                    max = 2 * k;
                }
            }else{
                max = 2 *k; //if there is no left node
            }
            //如果当前及节点不小，则结束循环
            if(!less(k, max)){
                break;
            }
            //如果当前节点小，则swap
            swap(k, max);
            k = max;
        }
    }
}
