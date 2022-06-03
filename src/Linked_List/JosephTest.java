package Linked_List;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class JosephTest {
    public static void main(String[] args) {
        //1.generate circular linked list, which includes 41 nodes,store the value
        Node <Integer> first = null; // record the first node
        Node <Integer> prev = null; // record the prev node when generate new node

        for (int i = 1; i <= 41; i++) {
            //if it is first node
            if (i == 1){
                first = new Node<>(i, null);
                prev = first;
                continue;
            }
            // else not the first node
            Node<Integer> newNode = new Node<>(i, null);
            prev.next = newNode;
            prev = newNode;
            // if the last node -> first node
            if (i == 41){
                prev.next = first;
            }
        }

        //2. init count, to mock number++
        int count = 0;
        //3. loop the circular linked list, delete node
        Node <Integer> n = first;
        Node<Integer> dummy = null;

        while(n != n.next){
            //mock num++
            count++;
            // if 3 -> delete the cur node, print cur node, reset node
            if (count == 3){
                dummy.next = n.next;
                System.out.print(n.item + ",");
                count = 0;
                n =n.next;
            }else {
                dummy = n;
                n = n.next;
            }
        }
        System.out.print(n.item);

    }


    public static class Node <T>{
        T item;
        Node next;

        public Node(T item, Node next){
            this.item = item;
            this.next = next;
        }

    }
}
