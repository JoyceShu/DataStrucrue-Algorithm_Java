package Linked_List;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.insert("Rose");
        l1.insert("Jennie");
        l1.insert("List");
        l1.insert("Jisoo");

        for (String l: l1){
            System.out.println(l);
        }

        System.out.println("--------------------------------------");
        //test get
        String getResult = l1.get(1);
        System.out.println("Element at index 1: " + getResult);
        //test remove
        String removeRes = l1.remove(0);
        System.out.println("Removed Element is :" + removeRes);
        //test clear
        l1.clear();
        System.out.println("the length of LinkedList after clear:" + l1.length());

    }
}
