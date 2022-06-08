package Tree;

public class BinaryTree <Key extends Comparable<Key>, Value>{

    private int N;//记录树中元素的个数
    private Node root;

    private class Node{
        public Key key;
        private Value value;
        public Node left;
        public Node right;

        public Node(Key key, Value value, Node left, Node right){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public int size(){
        return N;
    }
    //向树中添加元素的个数 key-value
    public void put(Key key, Value value){
        root = put(root, key, value);
    }


    private Node put(Node x, Key key, Value value){
        //如果子树为空
        if (x == null){
            N++;
            return new Node(key, value, null,null);
        }

        //如果子树不为空 -> 比较x节点和key的大小：

        int cmp = key.compareTo(x.key);
        if (cmp > 0){
            // 如果key大于x节点的key，找right node
            x.right = put(x.right, key, value);

        }else if (cmp <0){
            //如果key < x.key -> 继续找x节点的left node
            x.left = put(x.left,key,value);
        }else {
            x.value = value;
        }
        //如果 等于，就替换 value
        return x;
    }
    public Value get(Key key){

        return get(root, key);
    }
    public Value get(Node x, Key key){
        if (x == null){
            return null;
        }else{
            int cmp = key.compareTo(x.key);
            if (cmp > 0){
                // 如果key大于x节点的key，找right node
                return get(x.right, key);

            }else if (cmp <0){
                //如果key < x.key -> 继续找x节点的left node
                return  get(x.left, key);

            }else {
                return x.value;
            }
        }
    }
    public void delete(Key key){
        delete(root, key);
    }
    public  Node delete(Node x,Key key){
        if(x == null){
            return null;
        }else{
            int cmp = key.compareTo(x.key);
            if (cmp > 0){
                // 如果key大于x节点的key，找right node
                x.right = delete(root.right,key);

            }else if (cmp < 0){
                //如果key < x.key -> 继续找x节点的left node
                x.left = delete(root.left, key);
            }else {
                //找右子树中最小的节点
                if (x.right == null){
                    return x.left;
                }
                if (x.left == null){
                    return x.right;
                }
                Node minNode = x.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                //delete右子树中最小的节点
                Node n = x.right;
                while(n.left != null){
                    if (n.left.left == null){
                        n.left = null;
                    }else{
                        n = n.left;
                    }
                }
                minNode.left =x.left;
                minNode.right = x.right;
                x = minNode;
                N--;
            }
            return x;


        }

    }

}
