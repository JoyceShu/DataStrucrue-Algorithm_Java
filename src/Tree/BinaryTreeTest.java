package Tree;

public class BinaryTreeTest {
    public static void main(String[] args) throws Exception{
        BinaryTree <Integer, String> bt = new BinaryTree<>();
        bt.put(1, "Jennie");
        bt.put(2, "Rose");
        bt.put(3, "Jisoo");
        bt.put(4, "Lisa");

        System.out.println(bt.size());
        System.out.println(bt.get(1));
        bt.put(1,"BlackPink");
        System.out.println(bt.get(1));
        System.out.println(bt.size());
        bt.delete(1);

    }


}
