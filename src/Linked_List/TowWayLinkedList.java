package Linked_List;

import java.util.Iterator;

public class TowWayLinkedList<T> implements Iterable<T> {

    //init first & last nodes, and length
    private Node head;
    private Node last;
    private int N;


    private class Node{
        public Node(T item, Node prev, Node next){
            this.item = item;
            this.prev = prev;
            this.next = next;

        }
        //store data;
        public T item;
        public Node prev;
        public Node next;
    }

    public TowWayLinkedList(){
        //init head & last node
        this.head = new Node(null, null, null);
        this.last = null;
        this.N = 0;
    }

    public void clear(){
        this.head.next = null;
        this.head.prev = null;
        this.head.item = null;
        this.last = null;
        this.N = 0;

    }

    public int length(){
        return N;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.next.item;
    }

    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }

    //insert element T
    public void insert(T t){

        if(isEmpty()){
            Node newNode = new Node(t,head, null);
            last = newNode;
            head.next = last;

        }else{
            Node oldLast = last;
            Node newNode = new Node(t, oldLast, null);
            oldLast.next = newNode;
            last = newNode;

        }
        N++;
    }

    //insert element in designated position
    public void insert(int i, T t){
        //find the ith.prev
        Node prev = head;
        for (int j = 0; j < i ; j++) {
            prev = prev.next;
        }

        //find ith-> node
        Node cur = prev.next;

        //create newNode
        Node newNode = new Node(t, prev, cur);
        //prev -> new -> cur
        prev.next = newNode;
        cur.prev = newNode;
        //length + 1
        N++;
    }

    //get Node in idx I
    public T get(int i){
        Node n = head.next;
        for (int j = 0; j < i; j++) {
            n = n.next;
        }
        return n.item;
    }

    //find element T position
    public int IndexOf(T t){
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.next.equals(t)){
                return i;
            }
        }
        return -1;
    }

    //remove t
    public T remove(int i){
        Node prev = head;
        for (int j = 0; j < i ; j++) {
            prev = prev.next;
        }

        Node cur = prev.next;

        Node nextNode = cur.next;

        prev.next = nextNode;

        nextNode.prev = prev;
        N--;

        return cur.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator{
        private Node n;
        public TIterator()
        {
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
