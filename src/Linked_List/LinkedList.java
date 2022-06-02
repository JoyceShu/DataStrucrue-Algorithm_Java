package Linked_List;

import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T> {
    private Node head; // the head of ListNode
    private int N; // recode the length of the linked list



    private class Node {
        //store data
        T item;
        //pointer to the next node
        Node next;

        public Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }
    public LinkedList(){
        // init the head node
        this.head  = new Node(null, null); //by default- it's an empty node
        this.N = 0;

    }
    public void clear(){
        this.N = 0;
        head.next = null;
    }

    public int length(){
        return N;
    }

    public boolean isEmpty(){
        return N==0;
    }
    // to get Node in the index i;
    public T get(int i){
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.item;
    }
    //insert new node to the tail of linked list
    public void insert(T t){
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        N++;
    }
    // insert new node to designated position
    public void insert(int i, T t){
        //在 i位置添加一个node，需要先找到 i 位置的前一个node
        Node prev = head;
        for (int j = 0; j <= i - 1; j++) {
            prev = prev.next;
        }
        //现在i位置的值，
        Node cur = prev.next;
        //将newNode。next指向cur
        Node newNode = new Node(t, cur);
        //prev.next 指向newNode
        prev.next = newNode;
        N++;
    }
    public T remove(int i){
        //在 i位置删除一个node，需要先找到 i 位置的前一个node
        Node prev = head;
        for (int j = 0; j < i - 1; j++) {
            prev = prev.next;
        }
        Node cur = prev.next;
        Node nextNode = cur.next;
        prev.next = nextNode;
        //找到i位置的节点
        //找到i位置的下一个节点
        N--;
        return cur.item;
    }

    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next != null;) {
            n = n.next;
            if (n.item == t){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator{
        private Node n;

        public LIterator(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }



}
