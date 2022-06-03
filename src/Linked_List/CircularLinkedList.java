package Linked_List;

public class CircularLinkedList {
    public static void main(String[] args) throws Exception {
        Node <String> aa = new Node<String>("aa",null);
        Node <String> bb = new Node<String>("bb",null);
        Node <String> cc = new Node<String>("cc",null);
        Node <String> dd = new Node<String>("dd",null);
        Node <String> ee = new Node<String>("ee",null);
        Node <String> ff = new Node<String>("ff",null);
        Node <String> gg = new Node<String>("gg",null);

        aa.next = bb;
        bb.next = cc;
        cc.next = dd;
        dd.next = ee;
        ee.next = ff;
        ff.next = gg;
        //linked tail to the head
        gg.next = aa;


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
