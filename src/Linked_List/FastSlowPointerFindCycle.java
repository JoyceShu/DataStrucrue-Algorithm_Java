package Linked_List;

public class FastSlowPointerFindCycle {
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
        //generate circle
        gg.next = cc;

        boolean circle = isCircle(aa);
        System.out.println("If circle: " + circle);




    }

    public static boolean isCircle(Node<String> first){
        Node<String> fast = first;
        Node<String> slow = first;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)){
                return true;
            }
        }


        return false;

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
