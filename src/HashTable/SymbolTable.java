package HashTable;
//used linked list to achieve the hash table here, we can use array too
//for a single key-value pair, key only has one unique value, but values could have more than one element;

public class SymbolTable <Key, Value>{
    private Node head;
    private int N;

    public SymbolTable(){
        head = new Node(null, null, null);
        N = 0;
    }

    public int size(){
        return N;
    }

    public void put(Key key, Value value){
        //符号表中已经存过了key为的键值对——》找到该节点，替换value
        Node n = head;
        while (n.next != null){
            n = n.next;
            if (n.key.equals(key)){
                n.value = value;
                return;
            }
        }
        //如果符号表中不存在键为key的键值对，则创建新节点，保存要插入的键值对，把新节点插入到链表的头部，head.next=新节点即可
        Node newNode = new Node(key, value, null);
        Node prev = head.next;
        newNode.next = prev;
        head.next = newNode;
        N++;
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
