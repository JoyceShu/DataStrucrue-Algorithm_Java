package HashTable;
//used linked list to achieve the hash table here, we can use array too
//for a single key-value pair, key only has one unique value, but values could have more than one element;

public class OrderSymbolTable<Key extends Comparable<Key>, Value> {
    private Node head;
    private int N;

    public OrderSymbolTable(){
        head = new Node(null, null, null);
        N = 0;
    }

    public int size(){
        return N;
    }

    public void put(Key key, Value value){
        Node curr = head.next;
        Node prev = head;

        while (curr != null && key.compareTo(curr.key) >0){
            prev = curr;
            curr = curr.next;

        }
        if (curr != null && curr.key.compareTo(key) == 0){
            curr.value = value;
            return;
        }
        Node newNode = new Node(key, value, curr);
        prev.next = newNode;

    }

    public void delete(Key key){
        //找到键为key的节点，把该节点从链表中删除
        Node n = head;
        while (n.next != null){
            //判断n节点的下一个节点的key是否为key
            if(n.next.key.equals(key)){
                n.next = n.next.next;
                N--;
                return;
            }
            n = n.next;
        }

    }

    public Value get(Key key){
        Node n = head;
        while(n.next != null){
            n = n.next;
            if(n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }


    private class Node{
        public Key key;
        public Value value;
        public Node next;

        public Node(Key key, Value value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

}
