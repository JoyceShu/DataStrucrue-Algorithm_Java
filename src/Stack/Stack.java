package Stack;

import java.util.Iterator;
import java.util.Spliterator;

public class Stack <T> implements Iterable<T>{
    private Node head;
    private int N;

    public Stack(){
        head = new Node(null, null);
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(T t){
        Node preNext = head.next;
        Node newNode = new Node(t, preNext);
        head.next = newNode;
        N ++;
    }

    public T pop(){
        Node preNext = head.next;

        if (preNext == null){
            return null;
        }
        N--;
        head.next = head.next.next;
        return preNext.item;
    }

    public int size(){
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator<T>{
        private Node n = head;
        @Override
        public boolean hasNext(){
            return n.next == null;
        }

        @Override
        public T next(){
            Node node = n.next;
            n = n.next;
            return node.item;
        }


    }


    private class Node{
        public T item;
        public Node next;

        public Node(T item, Node next){
            this.item = item;
            this.next = next;

        }
    }
}
